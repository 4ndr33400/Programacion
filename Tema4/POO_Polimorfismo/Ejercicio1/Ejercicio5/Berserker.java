package POO_Polimorfismo.Ejercicio1.Ejercicio5;
import java.util.Random;

public class Berserker extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int fisicDamage;
    private int health;
    private final String DEFAULT_DAMAGE_TYPE = "Daño fisico";
    private final String DEFAULT_ATTACK_TYPE = "Cuerpo a cuerpo";
    private final String DEFAULT_NAME_FIGHTER = "Berserker";

    public Berserker(String damageType, String attackType,int damageCaused) {
        super(damageType,attackType,damageCaused);
    }

    public void setFisicDamage(int fisicDamage) {
        this.fisicDamage = fisicDamage;
    }

    public int getHealth() {
        return health;
    }
    @Override
    public Ataque attack() {
        int hitPlayer = random.nextInt(1,50);
        hitPlayer = hitPlayer + (10 - getHealth());
        return new Ataque(DEFAULT_DAMAGE_TYPE,DEFAULT_ATTACK_TYPE,hitPlayer);
    }

    @Override
    public void defense(Ataque ataque){
        if (ataque.getAttackType().equals("Ataque a distancia")){
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
