package POO_3.Ejercicio2;

public abstract class Animal {
    public int numberPaws;
    public String habitat;

    public Animal(int numberPaws, String habitat) {
        this.numberPaws = numberPaws;
        this.habitat = habitat;
    }

    public abstract void animalEat();

    public abstract void animalSleep();
    public abstract void animalMakeNoise();
}
