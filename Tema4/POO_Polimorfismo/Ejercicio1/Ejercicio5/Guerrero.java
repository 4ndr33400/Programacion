package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Guerrero extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int fisicDamage;
    private int health;
    private final String DEFAULT_DAMAGE_TYPE = "Daño fisico";
    private final String DEFAULT_ATTACK_TYPE = "Cuerpo a cuerpo";

    public Guerrero(String damageType, String attackType, int damageCaused) {
        super(damageType, attackType, damageCaused);
    }

    @Override
    public Ataque attack() {
        int hitPlayer = random.nextInt(1,50);
        return new Ataque(DEFAULT_DAMAGE_TYPE,DEFAULT_ATTACK_TYPE,hitPlayer);
    }

    @Override
    public void defense(Ataque ataque) {
        if (getDamageType().equals("Daño Fisico")){
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
