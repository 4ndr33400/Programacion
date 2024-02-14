package POO_3.Ejercicio8;

public class AtaqueBolaDeFuego implements IAtaqueAvanzado{
    @Override
    public void throwAttack() {
        System.out.println("Se ha lanzado un ataque bola de fuego");
    }

    @Override
    public CosteAtaque costAttack() {
        return new CosteAtaque();
    }

    @Override
    public DañoInflingido damageCaused() {
        return new DañoInflingido();
    }
}
