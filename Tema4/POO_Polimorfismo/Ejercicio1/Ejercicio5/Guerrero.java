package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Guerrero  implements ICombatiente{
    static Random random = new Random();
    private int health;

    @Override
    public Ataque attack() {
        Ataque ataque = new Ataque(Ataque.damageType.CUERPO_a_CUERPO);
        int hitPlayer = random.nextInt(1,50);
        ataque.setFisicDamage(hitPlayer);
        return ataque;
    }

    @Override
    public void defense(Ataque ataque) {
        if (ataque.getDamageType() == Ataque.damageType.CUERPO_a_CUERPO){
            health -= ataque.getDamageCaused() / 2;
        } else {
            health -= ataque.getDamageCaused();
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
