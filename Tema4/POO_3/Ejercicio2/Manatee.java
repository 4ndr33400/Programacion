package POO_3.Ejercicio2;

public class Manatee extends Animal{
    String specie;
    public Manatee(int numberPaws, String habitat, String specie) {
        super(numberPaws, habitat);
        this.specie = specie;
    }

    @Override
    public void animalEat() {
        System.out.println("El manatee esta comiendo algas porque esta gordito");
    }

    @Override
    public void animalSleep() {
        System.out.println("ZzZzZzZzZZ");
    }

    @Override
    public void animalMakeNoise() {
        System.out.println("GLUP GLUP GLUP");
    }

}
