package POO_3.Ejercicio2;
import java.util.Scanner;
public class PruebaAnimal {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Cuantas patas tiene tu animal?: ");
        int numberPaws = in.nextInt();
        System.out.print("Es tu animal domestico o vive en libertad?: ");
        String habitat = in.nextLine();
        in.nextLine();
        System.out.println("Que tipo de animal tienes?: ");
        System.out.println("1. Tienes un Chachito" +
                "\n2. Una rana" +
                "\n3. Un manatee" +
                "\n4. Un mapache" +
                "\n5. Un perro vulgar >:(");
        System.out.print("Introduczca la seleccion: ");
        int option = in.nextInt();
        switch (option){
            case 1:
                System.out.println("Eres un makina : )");
                System.out.print("De que raza es tu minino?: ");
                String breed = in.nextLine();
                Cat chachito = new Cat(numberPaws,habitat,breed);
                chachito.animalEat();
                chachito.animalSleep();
                chachito.animalMakeNoise();
                chachito.stealFoodOnCounter();
                System.out.println("Chachito es mi animal espiritual");
                break;
            case 2:
                System.out.print("La rana tiene colores llamativos?");
                String isVenoumus = in.nextLine();
                Frog rana = new Frog(numberPaws,habitat,isVenoumus);
                rana.animalEat();
                rana.animalMakeNoise();
                if(rana.isFrogVenoumus()){
                    System.out.println("Sera mejor q no te acerques mucho a esa rana");
                } else{
                    System.out.println("Tu rana no es venenosa");
                }
                break;
            case 3:
                if (numberPaws > 0){
                    System.out.println("Los manaties no tienen patas mongolo");
                }
                System.out.print("De que especie es tu manatee?: ");
                String specie = in.nextLine();
                Manatee manatee = new Manatee(numberPaws,habitat,specie);
                manatee.animalEat();
                manatee.petTheManatee();
            case 4:
                Racoon mapache = new Racoon(numberPaws,habitat);
                mapache.animalSleep();
                mapache.racoonSneaksIntoContainer();
            case 5:
                System.out.println("Adios :)");
                break;
        }

    }

}
