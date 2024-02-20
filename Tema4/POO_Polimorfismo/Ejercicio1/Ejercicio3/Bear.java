package POO_Polimorfismo.Ejercicio1.Ejercicio3;

public class Bear extends Animal implements IHaceRuido,IAnimalAtaca{

    @Override
    public void animalMakeNoise() {
        System.out.println("El oso esta haciendo ruido");
    }

    @Override
    public void animalAttacks() {
        System.out.println("El oso va a atacar");
    }
}
