package POO_Polimorfismo.Ejercicio1.Ejercicio3;

public class Wolf extends Animal implements IHaceRuido,IAnimalAtaca{
    @Override
    public void animalMakeNoise() {
        System.out.println("El lobo esta aullando");
    }

    @Override
    public void animalAttacks() {
        System.out.println("El lobo se acerca para atacar");
    }
}
