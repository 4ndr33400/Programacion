package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Bardo extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int health;

    public Bardo(Ataque.damageType damageType, Ataque.attackType attackType, int damageCaused, int health) {
        super(damageType, attackType, damageCaused);
        this.health = health;

    }

    @Override
    public Ataque attack() {
        Ataque damageType;
        int hitplayer = random.nextInt(50);
        int attackType = random.nextInt(100);

        if (hitplayer >= 40) {
            hitplayer = 100;
        }

        if (attackType > 50){
            damageType = new Ataque(Ataque.damageType.A_DISTANCIA, Ataque.attackType.FISICO, hitplayer);

        } else {
            damageType = new Ataque(Ataque.damageType.CUERPO_a_CUERPO,Ataque.attackType.FISICO,hitplayer);
        }

        return damageType;
    }

    @Override
    public void defense(Ataque ataque) {
        health -= getDamageCaused() * 2;
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
