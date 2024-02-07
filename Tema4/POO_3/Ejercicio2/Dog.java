package POO_3.Ejercicio2;

public class Dog extends Animal{
    public int age;
    public Dog(int numberPaws, String habitat,int age) {
        super(numberPaws, habitat);
        this.age=age;
    }

    @Override
    public void animalEat() {
        System.out.println("El perro esta comiendose las sobras de la paella del domingo");
    }

    @Override
    public void animalSleep() {
        System.out.println("El perro se echa una siesta encima de los pantalones recien planchados");

    }

    @Override
    public void animalMakeNoise() {
        System.out.println("woof woof woof");
    }
    public boolean dogGivesYouPaw(){
        boolean doesItGiveYouPaw = false;
        if(age > 3){
            doesItGiveYouPaw = true;
        }
        return doesItGiveYouPaw;
    }
}
