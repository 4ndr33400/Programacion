import java.util.Scanner;
public class HeroPruebas {
    static Scanner in = new Scanner(System.in);
    static String nextLine;
    public static void main (String[] args){
        System.out.println("A continuacion elige las stats del primer personaje");
        System.out.println("Recuerda que existen un maximo para las siguentes stats:" +
                "\nVida: 400pt" +
                "\nAtaque: 100pt" +
                "\nDefensa: 100pt " +
                "\nNivel: 1" +
                "\nExperiencia: 0pt");

        System.out.println("//Introduzca cualquier letra para continuar//");
        nextLine = in.nextLine();

        System.out.println("*** HERO 1 ***");
        System.out.print("Nombre: ");
        String namePlayer1 = in.nextLine();
        System.out.print("Vida: ");
        int healthPlayer1 = in.nextInt();
        in.nextLine();
        System.out.print("Ataque: ");
        int attackPlayer1 = in.nextInt();
        in.nextLine();
        System.out.print("Defensa: ");
        int defensePlayer1 = in.nextInt();
        in.nextLine();
        System.out.print("Nivel: ");
        int levelPlayer1 = in.nextInt();
        in.nextLine();

        Hero heroPlayer1 = new Hero(namePlayer1,levelPlayer1,healthPlayer1, attackPlayer1,defensePlayer1);

        System.out.println(heroPlayer1);

        System.out.println("//Introduzca cualquier letra para continuar//");
        nextLine = in.nextLine();

        System.out.println("*** HERO 2 ***");
        System.out.print("Nombre: ");
        String namePlayer2 = in.nextLine();
        System.out.print("Vida: ");
        int healthPlayer2 = in.nextInt();
        in.nextLine();
        System.out.print("Ataque: ");
        int attackPlayer2 = in.nextInt();
        in.nextLine();
        System.out.print("Defensa: ");
        int defensePlayer2 = in.nextInt();
        in.nextLine();
        System.out.print("Nivel: ");
        int levelPlayer2 = in.nextInt();
        in.nextLine();

        Hero heroPlayer2 = new Hero(namePlayer2,levelPlayer2,healthPlayer2, attackPlayer2,defensePlayer2);

        System.out.println(heroPlayer2);

        System.out.println("//Introduzca cualquier letra para comenzar la partida//");
        nextLine = in.nextLine().toLowerCase();


        int rounds = 1;

        do{
            System.out.println("Es el turno de " + heroPlayer1.getName());
            heroPlayer1.attackPlayer(heroPlayer2);

            System.out.println(heroPlayer2.getName() + " corre hacia " + heroPlayer1.getName() + " para atacarle");
            heroPlayer2.attackPlayer(heroPlayer1);

            heroPlayer1.healPlayer(heroPlayer1);
            heroPlayer2.healPlayer(heroPlayer2);

            System.out.println("Esta ha sido la " + rounds + " ronda." );
            System.out.println(heroPlayer1);
            System.out.println(heroPlayer2);
            System.out.println("//Introduzca cualquier letra para seguir con la partida//");
            nextLine = in.nextLine();
            rounds++;

            if (heroPlayer1.getHealth() <= 0 || heroPlayer2.getHealth() <= 0) {
                System.out.println("GAME OVER");
                if (heroPlayer1.getHealth() <= 0){
                    System.out.println(heroPlayer2.getName() + " gana la partida");

                } else {
                    System.out.println(heroPlayer1.getName() + " gana la partida");
                }
                break;
            }

        } while (heroPlayer1.getHealth() > 0 && heroPlayer2.getHealth() > 0);
    }
}
