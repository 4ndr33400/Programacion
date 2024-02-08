package POO_3.Ejercicio5;

public class PublicacionVideo implements IPublicacion,IAbrirAplicacion{
    @Override
    public void publicar() {
        System.out.println("Se ha publicado un video");
    }

    @Override
    public void comparatir() {
        System.out.println("Se ha compartido un video");
    }

    @Override
    public void abrirAplicacion() {
        System.out.println("Se ha abierto un video");
    }
}
