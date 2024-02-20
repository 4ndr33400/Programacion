package POO_Polimorfismo.Ejercicio1.Ejercicio3;

public class Owl extends Animal implements IHaceRuido,IAnimalAtaca {
    @Override
    public void animalMakeNoise() {
        System.out.println("El buho esta haciendo ruido");
    }

    @Override
    public void animalAttacks() {
        System.out.println("El buho va a atacar");
    }
}
