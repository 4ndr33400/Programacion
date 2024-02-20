package POO_Polimorfismo.Ejercicio1.Ejercicio3;

import java.util.Random;

public class SimulacionBosque {
    static Random random = new Random();

    public static void main(String[] arg) {

        boolean didItAttack = false;
        int numberAnimal = 0;
        Animal[] animales = new Animal[3];
        do {
            System.out.println("Se estan escuchando muchos ruidos");
            int chance = random.nextInt(100);
            int typeAnimal = random.nextInt(1, 3);
            switch (typeAnimal) {
                case 1:
                    animales[numberAnimal] = new Owl();

                    break;
                case 2:
                    animales[numberAnimal] = new Wolf();

                    break;
                case 3:
                    animales[numberAnimal] = new Bear();

                    break;
            }

            numberAnimal++;
        } while (!didItAttack);

    }
}
