package POO_3.Ejercicio2;

public class Frog extends Animal{
    String isVenoumus;
    public Frog(int numberPaws, String habitat, String isVenoumus) {
        super(numberPaws, habitat);
        this.isVenoumus = isVenoumus;
    }
    @Override
    public void animalEat() {
        System.out.println("La rana esta intentando cazar su almuerzo pero se ha ido volando :(");
    }

    @Override
    public void animalSleep() {
        System.out.println("Las ranas no duermen");
    }

    @Override
    public void animalMakeNoise() {
        System.out.println("croac croac croac");
    }
    public boolean isFrogVenoumus(){
        boolean isFrogVenoumus = false;
        if(isVenoumus.equals("SI")){
            isFrogVenoumus = true;
        }
        return isFrogVenoumus;
    }
}
