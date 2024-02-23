package POO_Polimorfismo.Ejercicio1.Ejercicio5;
import java.util.Random;

public class Berserker extends Ataque implements ICombatiente{
    static Random random = new Random();
    private int fisicDamage;
    private int health;
    private final int DEFAULT_MAGIC_ATTACK = 0;
    private final String DEFAULT_ATTACK_TYPE = "Cuerpo a cuerpo";

    public Berserker(int fisicDamage, int magicDamage, String attackType) {
        super(fisicDamage, magicDamage, attackType);
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
        return new Ataque(hitPlayer,0,"cuerpo a cuerpo");
    }

    @Override
    public Ataque defense(Ataque ataque) {
        int
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
