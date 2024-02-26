package POO_Polimorfismo.Ejercicio1.Ejercicio5;
import java.util.Random;

public class Berserker extends Ataque implements ICombatiente{
    static Random random = new Random();

    private int health;

    public Berserker(damageType damageType, attackType attackType, int damageCaused) {
        super(damageType, attackType, damageCaused);
    }

    public int getHealth() {
        return health;
    }
    @Override
    public Ataque attack() {
        int hitPlayer = random.nextInt(1,50);
        hitPlayer = hitPlayer + (10 - getHealth());
        return new Ataque(damageType.CUERPO_a_CUERPO,attackType.FISICO,hitPlayer);
    }

    @Override
    public void defense(Ataque ataque){
        if (Ataque.damageType.equals(damageType.A_DISTANCIA)){
            health -= getDamageCaused() * 2;
        } else {
            health -= getDamageCaused();
        }
    }

    @Override
    public boolean isAlive() {
        boolean isAlive = true;
        if (health <= 0){
            isAlive = false;
        }
        return isAlive;
    }
}
