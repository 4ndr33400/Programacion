package POO_3.Ejercicio2;

public class Racoon extends Animal{
    public Racoon(int numberPaws, String habitat) {
        super(numberPaws, habitat);
    }

    @Override
    public void animalEat() {
        System.out.println("El mapache acaba de robarte la cena de ayer");
    }

    @Override
    public void animalSleep() {
        System.out.println("El mapache se esta pegando una siesta cojonuda");
    }

    @Override
    public void animalMakeNoise() {
        System.out.println("Mapache te acaba de romper el jarron");
    }

    public void racoonSneaksIntoContainer(){
        System.out.println("Escuchas sonidos que vienen de el contenedor de afuera");
    }
}
