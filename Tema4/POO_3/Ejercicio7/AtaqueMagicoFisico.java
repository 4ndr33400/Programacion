package POO_3.Ejercicio7;

public class AtaqueMagicoFisico  implements IAtaque{
    AtaqueFisico ataqueFisico = new AtaqueFisico();
    AtaqueMagico ataqueMagico = new AtaqueMagico();
    @Override
    public void throwAttack() {
        System.out.println("Lanza un hechizo paralizador que le permite atacar fisicamente a su oponente");
    }

    @Override
    public int costAttack() {
        return ataqueFisico.getDEFAULT_COST_FISIC_ATTACK() + ataqueMagico.getDEFAULT_COST_MAGIC_ATTACK();
    }

    @Override
    public int damage() {
        return ataqueFisico.getDEFAULT_DAMAGE_FISIC_ATTACK() + ataqueMagico.getDEFAULT_DAMAGE_MAGIC_ATTACK();
    }
}
