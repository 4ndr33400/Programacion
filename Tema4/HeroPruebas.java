import java.util.Scanner;
public class HeroPruebas {
    static Scanner in = new Scanner(System.in);
    static String nextLine;
    public static void main (String[] args){
        System.out.println("A continuacion elige las stats del primer personaje");
        System.out.println("Recuerda que existen un maximo para las siguentes stats:" +
                "\nVida: 300pt" +
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

        heroPlayer1.setHealth(healthPlayer1);
        heroPlayer1.setAttack(attackPlayer1);
        heroPlayer1.setDefense(defensePlayer1);
        heroPlayer1.setLevel(levelPlayer1);
        heroPlayer1.infoCharacters();

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

        heroPlayer2.setHealth(healthPlayer2);
        heroPlayer2.setAttack(attackPlayer2);
        heroPlayer2.setDefense(defensePlayer2);
        heroPlayer2.setLevel(levelPlayer2);

        heroPlayer2.infoCharacters();

        System.out.println("//Introduzca cualquier letra para comenzar la partida//");
        nextLine = in.nextLine().toLowerCase();

        boolean isGameOver = false;
        int rounds = 1;
        do{
            System.out.println("Es el turno de " + heroPlayer1.getName());
            healthPlayer2 = heroPlayer1.attackPlayer(heroPlayer1,heroPlayer2);

            System.out.println(heroPlayer2.getName() + " corre hacia " + heroPlayer1.getName() + " para atacarle");
            healthPlayer1 = heroPlayer2.attackPlayer(heroPlayer2,heroPlayer1);

            healthPlayer1 = healPlayer(healthPlayer1,heroPlayer1);
            healthPlayer2 = healPlayer(healthPlayer2,heroPlayer2);

            if (healthPlayer1 <= 0 || healthPlayer2 <= 0) {
                System.out.println("GAME OVER");
                if (healthPlayer1 <= 0){
                    System.out.println(heroPlayer2.getName() + " gana la partida");
                } else {
                    System.out.println(heroPlayer1.getName() + " gana la partida");
                }
                isGameOver = true;
            }

            System.out.println("Esta ha sido la " + rounds + " ronda." );
            heroPlayer1.infoCharacters();
            heroPlayer2.infoCharacters();
            System.out.println("//Introduzca cualquier letra para seguir con la partida//");
            nextLine = in.nextLine();
            rounds++;

        } while (!isGameOver);
    }

    public static int healPlayer(int healthPlayer, Hero hero){
        if (healthPlayer > 50){
            healthPlayer = hero.drinkPotion();
        } else {
            healthPlayer = hero.rest();
        }
        return healthPlayer;
    }
}
