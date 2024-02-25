package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Bardo extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int fisicDamage;
    private int health;
    private String DEFAULT_DAMAGE_TYPE = "Daño fisico";

    public Bardo(String damageType, String attackType, int damageCaused) {
        super(damageType, attackType, damageCaused);
    }

    @Override
    public Ataque attack() {
        int attackType = random.nextInt(100);
        if (attackType > 50){
            Ataque.getAttackType() = "Cuerpo a cuerpo";
        }
        return null;
    }

    @Override
    public void defense(Ataque ataque) {

    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
