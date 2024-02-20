package POO_Polimorfismo.Ejercicio1.Ejercicio3;

import java.util.Random;

public class SimulacionBosque {
    static Random random = new Random();

    public static void main(String[] arg) {

        boolean didItAttack = false;
        Animal[] animales = new Animal[3];
        animales[0] = new Owl();
        animales[1] = new Wolf();
        animales[2] = new Bear();
        do {
            System.out.println("Se estan escuchando muchos ruidos");
            int chance = random.nextInt(100);
            int typeAnimal = random.nextInt(1, 3);
            switch (typeAnimal) {
                case 1:
                    ((Owl) animales[0]).makeNoise();
                    break;
                case 2:
                    ((Wolf) animales[1]).makeNoise();
                    break;
                case 3:
                    ((Bear) animales[2]).makeNoise();
                    break;
            }
            if(animalAttack(chance)){
                animales[0].animalAttack();
                didItAttack = true;
            }

        } while (!didItAttack);

    }
    public static boolean animalAttack(int chance){
        boolean didItAttack = false;
        if (chance > 95){
            didItAttack = true;
        }
        return  didItAttack;
    }
}
