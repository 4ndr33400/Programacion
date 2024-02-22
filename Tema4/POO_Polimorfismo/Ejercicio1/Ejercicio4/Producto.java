package POO_Polimorfismo.Ejercicio1.Ejercicio4;
public class Producto {
    private int codProduct;
    private String title;

    public Producto(int codProduct, String title) {
        this.codProduct = codProduct;
        this.title = title;
    }

    public int getCodProduct() {
        return codProduct;
    }

    public String toString(){
        return "Titulo: " + title +
                "\nCodigo de producto: " + codProduct;
    }
}
