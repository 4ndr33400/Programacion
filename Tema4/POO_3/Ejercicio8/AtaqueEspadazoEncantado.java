package POO_3.Ejercicio8;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado{
    @Override
    public void throwAttack() {
        System.out.println("Se ha lanzado un ataque de espadazo encantado");
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
