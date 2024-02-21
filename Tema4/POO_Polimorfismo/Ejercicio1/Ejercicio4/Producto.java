package POO_Polimorfismo.Ejercicio1.Ejercicio4;
public class Producto {
    public int codProduct;
    public String title;

    public Producto(int codProduct, String title) {
        this.codProduct = codProduct;
        this.title = title;
    }
    public String toString(){
        return "Titulo: " + title +
                "Codigo de producto" + codProduct;
    }
}
