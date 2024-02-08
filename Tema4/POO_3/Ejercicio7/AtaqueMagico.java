package POO_3.Ejercicio7;

public class AtaqueMagico implements IAtaque{
    @Override
    public void throwAttack() {
        System.out.println("Lanza un hechizo sobre su oponente");
    }

    @Override
    public void costAttack() {
        System.out.println("El ataque te quita 5 puntos de la defensa");
    }

    @Override
    public void damage() {
        System.out.println("El ataque infringe un daño de 30 pts");
    }
}
