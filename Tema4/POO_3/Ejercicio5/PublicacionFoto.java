package POO_3.Ejercicio5;

public class PublicacionFoto implements IPublicacion, IAbrirAplicacion{
    @Override
    public void publicar() {
        System.out.println("Se ha publicado una foto");
    }

    @Override
    public void comparatir() {
        System.out.println("Se ha compartido una foto");
    }

    @Override
    public void abrirAplicacion() {
        System.out.println("Se ha abierto una foto");
    }
}
