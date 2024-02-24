package POO_Polimorfismo.Ejercicio1.Ejercicio5;

import java.util.Random;

public class Bardo extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int fisicDamage;
    private int health;
    private final String DEFAULT_DAMAGE_TYPE = "Daño Magico";
    private final String DEFAULT_ATTACK_TYPE = "A distancia";
    public Bardo(String damageType, String attackType, int damageCaused) {
        super(damageType, attackType, damageCaused);
    }

    @Override
    public Ataque attack() {
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
