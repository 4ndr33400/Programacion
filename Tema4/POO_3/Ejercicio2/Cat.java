package POO_3.Ejercicio2;
public class Cat extends Animal{
    String breed;
    public Cat(int numberPaws, String habitat,String breed) {
        super(numberPaws, habitat);
        this.breed = breed;
    }

    @Override
    public void animalEat() {
        System.out.println("Chachito se esta poniendo gordito JIJIJIJIIJIJ");
    }

    @Override
    public void animalSleep() {
        System.out.println("Chachito lleva 5 horas haciendo la fotosintesis en el suelo del salon");
    }

    @Override
    public void animalMakeNoise() {
        System.out.println("Chachito esta dando un concierto privado a las 3 de la fokin mañana");
    }

    public void stealFoodOnCounter(){
        System.out.println("Chachito acaba de robarte el pollito");
    }
}
