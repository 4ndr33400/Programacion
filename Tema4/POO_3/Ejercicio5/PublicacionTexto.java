package POO_3.Ejercicio5;

public class PublicacionTexto implements IPublicacion{
    @Override
    public void publicar() {
        System.out.println("Se ha publicado un texto");
    }

    @Override
    public void comparatir() {
        System.out.println("Se ha compartido un texto");
    }
}
