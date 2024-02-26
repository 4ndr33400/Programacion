package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Guerrero extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int health;

    public Guerrero(Ataque.damageType damageType, Ataque.attackType attackType, int damageCaused) {
        super(damageType, attackType, damageCaused);
    }
    @Override
    public Ataque attack() {
        int hitPlayer = random.nextInt(1,50);
        return new Ataque(damageType.CUERPO_a_CUERPO, attackType.FISICO,hitPlayer);
    }

    @Override
    public void defense(Ataque ataque) {
        if (Ataque.attackType.equals(Ataque.attackType.FISICO)){
            health -= getDamageCaused() / 2;
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
