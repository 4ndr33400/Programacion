package POO_3.Ejercicio7;

public class AtaqueMagico implements IAtaque{
    public final int DEFAULT_COST_MAGIC_ATTACK = 30;
    public final int DEFAULT_DAMAGE_MAGIC_ATTACK = 10;
    public int getDEFAULT_COST_MAGIC_ATTACK() {
        return DEFAULT_COST_MAGIC_ATTACK;
    }

    public int getDEFAULT_DAMAGE_MAGIC_ATTACK() {
        return DEFAULT_DAMAGE_MAGIC_ATTACK;
    }

    @Override
    public void throwAttack() {
        System.out.println("Lanza un hechizo sobre su oponente");
    }

    @Override
    public int costAttack() {
        return DEFAULT_COST_MAGIC_ATTACK;
    }

    @Override
    public int damage() {
        return DEFAULT_DAMAGE_MAGIC_ATTACK;
    }
}
