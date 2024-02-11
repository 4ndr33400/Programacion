package POO_3.Ejercicio7;

public class AtaqueFisico implements IAtaque{
    public final int DEFAULT_COST_FISIC_ATTACK = 25;
    public final int DEFAULT_DAMAGE_FISIC_ATTACK = 15;

    public int getDEFAULT_COST_FISIC_ATTACK() {
        return DEFAULT_COST_FISIC_ATTACK;
    }

    public int getDEFAULT_DAMAGE_FISIC_ATTACK() {
        return DEFAULT_DAMAGE_FISIC_ATTACK;
    }

    @Override
    public void throwAttack() {
        System.out.println("Lanza un ataque con puños o patada");
    }

    @Override
    public int costAttack() {
       return DEFAULT_COST_FISIC_ATTACK;
    }

    @Override
    public int damage() {
        return DEFAULT_DAMAGE_FISIC_ATTACK;
    }
}
