import java.util.Scanner;
import java.util.Random;
public class HeroPruebas2 {
    static Scanner in = new Scanner (System.in);
    static Random random = new Random();
    static String nextLine;

    public static void main (String[] args){
        System.out.println("A continuacion elige las stats del tu personaje");
        System.out.println("Recuerda que existen un maximo para las siguentes stats:" +
                "\nVida: 400pt" +
                "\nAtaque: 100pt" +
                "\nDefensa: 100pt " +
                "\nNivel: 1" +
                "\nExperiencia: 0pt");

        System.out.println("//Introduzca cualquier letra para continuar//");
        nextLine = in.nextLine();

        System.out.println("*** HERO ***");
        System.out.print("Nombre: ");
        String namePlayer = in.nextLine();
        System.out.print("Vida: ");
        int healthPlayer = in.nextInt();
        in.nextLine();
        System.out.print("Ataque: ");
        int attackPlayer = in.nextInt();
        in.nextLine();
        System.out.print("Defensa: ");
        int defensePlayer = in.nextInt();
        in.nextLine();
        System.out.print("Nivel: ");
        int levelPlayer = in.nextInt();
        in.nextLine();

        Hero heroPlayer = new Hero(namePlayer,levelPlayer,healthPlayer, attackPlayer,defensePlayer);
        System.out.println(heroPlayer);
        Hero enemy = new Hero(100,50,50);

        int numberHorde = 1;
        do{

            System.out.println("Va a comenzar la " + numberHorde + " horda, preparate!!");
            System.out.println("//Introduzca cualquier letra para continuar//");
            nextLine = in.nextLine();

            int numberEnemies = random.nextInt(1,3);
            Hero[] enemies = new Hero[numberEnemies];

            for(int i = 0; i < enemies.length; i++) {
                System.out.println("Se puede ver llegar "+ numberEnemies +" enemigo/os");
                System.out.println(heroPlayer.getName() + " ataca a uno de los enemigos");
                heroPlayer.attackPlayer(enemy);


            }

            if (heroPlayer.getHealth() <= 0){
                System.out.println("Los enemigos han podido contigo!!");
                System.out.println(heroPlayer.getName() + " ha sobrevivido " + numberHorde + " hordas.");
                break;
            }
            numberHorde++;
        }while(heroPlayer.getHealth() > 0);

    }
}
