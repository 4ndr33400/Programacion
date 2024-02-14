package POO_3.Ejercicio8;

public class AtaqueEspadazo implements IAtaqueAvanzado{
    @Override
    public void throwAttack() {
        System.out.println("Se ha lanzado un ataque espadazo");
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
