package POO_3.Ejercicio7;

public class AtaqueFisico implements IAtaque{
    @Override
    public void throwAttack() {
        System.out.println("Lanza un ataque con puños o patada");
    }

    @Override
    public void costAttack() {
        System.out.println("El ataque te cuesta 10 pts de stamina");
    }

    @Override
    public void damage() {
        System.out.println("Este ataque ingfringe 35 pts de daño");
    }
}
