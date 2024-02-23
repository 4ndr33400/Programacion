package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public class Bardo extends Ataque implements ICombatiente{
    public Bardo(int fisicDamage, int magicDamage, String attackType) {
        super(fisicDamage, magicDamage, attackType);
    }

    @Override
    public Ataque attack() {
        return null;
    }

    @Override
    public Ataque defense(Ataque ataque) {
        return null;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
