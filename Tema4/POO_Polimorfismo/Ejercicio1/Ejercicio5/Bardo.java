package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Bardo implements ICombatiente{
    static Random random = new Random();
    private int health;


    @Override
    public Ataque attack() {
        Ataque ataque;
        int hitplayer = random.nextInt(50);
        int attackType = random.nextInt(100);

        if (hitplayer >= 40) {
            hitplayer = 100;
        }
        if (attackType > 50){
            ataque = new Ataque(Ataque.damageType.A_DISTANCIA);
            ataque.setMagicDamage(hitplayer);

        } else {
            ataque = new Ataque(Ataque.damageType.CUERPO_a_CUERPO);
            ataque.setFisicDamage(hitplayer);
        }

        return ataque;
    }

    @Override
    public void defense(Ataque ataque) {
        health -= ataque.getDamageCaused() * 2;
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
