package Tema2;

import java.util.Random;
import java.util.Scanner;

public class CombatePorTurnosEnFunciones {
    static int Player = 0;
    static int AttackPlayer1 = 0;
    static int DefensePlayer1 = 0;
    static int SpeedPlayer1 = 0;
    static int HealthPlayer1 = 0;
    static int HealingPlayer1 = 0;
    static int ReHealthPlayer1 = 0;
    static int AttackPlayer2 = 0;
    static int DefensePlayer2 = 0;
    static int SpeedPlayer2 = 0;
    static int HealthPlayer2 = 0;
    static int HealingPlayer2 = 0;
    static int ReHealthPlayer2 = 0;
    static Random random = new Random();
    static Scanner shi = new Scanner(System.in);
    static char next;

    public static void showAsciiArtWinner() {
        next = shi.next().charAt(0);
        System.out.println(" .....                // Introduce n para continuar// ");
        next = shi.next().charAt(0);
        System.out.println(
                """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠁⠒⠂⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⢀⡠⠤⠔⠂⠀⠈⠁⠀⠀⠒⠒⠂⠤⠄⡀⠀⠀⠀⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡤⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⢀⣴⣶⣿⣿⣿⣿⣿⣷⣶⣦⣤⢄⡀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠒⠛⢲⣤⣀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⠿⠛⠋⠣⣉⣙⣄⠀⠀⡀⢠⣾⣿⣥⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡿⣿⠁⠀⢀⣠⣶⣾⠟⡉⢹⣴⡾⠛⠉⢩⡿⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠚⠉⢁⣴⣧⢀⡼⠟⠉⠀⠈⡆⣣⠟⠉⠀⠀⠀⠀⠀⢶⠀⢈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠶⠃⢀⣠⣴⡿⠟⠋⠀⠠⣀⣤⣀⣸⡟⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⣠⠴⠊⣀⣤⠾⠛⠋⠁⠀⠀⠀⠀⠀⠀⣹⠟⠉⠁⡄⠀⠀⠀⠀⠀⠀⠀⠀⠛⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣠⡞⣉⣴⠾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡁⠀⠀⠀⠙⣦⣀⣀⡀⠀⠀⠀⣀⡀⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⢀⣶⣯⡾⠋⠀⠀⠀⠀⣀⣀⣀⣀⣀⣒⣚⣿⠿⣿⠉⠲⢄⡀⠀⠈⠙⠿⠿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⣼⣿⠏⠀⠀⠀⠀⠀⠫⠥⠀⠤⠼⠓⠋⠉⠀⢸⠟⠀⠀⠀⠈⠲⡄⠀⠀⢰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⢿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠈⢆⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠻⡀⠀⠀⠀⠀⠀⠀⠰⢿⣛⣑⣦⡤⢾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠈⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⣷⠦⣄⡀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⣿⡄⠀⠙⠦⠀⠀⠀⢠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣻⣿⡀⠀⠀⠀⠀⠀⢸⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣀⣸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⢹⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠟⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣛⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣁⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣀⠀⢘⣛⣛⡛⠛⡛⣟⢛⡛⣛⡛⠛⠛⢻⣉⡉⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢉⣛⣛⣛⣛⣛⣛⣛⣛⣛⣓""");
    }

    public static int habilityPlayers(int Player, int Health, int hitPlayer) {


        if (Player == 1 && Health < 50 && hitPlayer > 75) {
            hitPlayer = random.nextInt(85, 120);
            System.out.println("Harley Quinn ha lanzado su golpe critico 'Clown Strike' con " + hitPlayer + " puntos de daño OUCHH");
        } else if (Player == 2 && hitPlayer > 45) {
            hitPlayer = random.nextInt(65, 80);
            System.out.println("Zombie ha lanzado su golpe critico 'The Bite of Death' con " + hitPlayer + " puntos de daño OUCHH");
        } else if (Player == 3 && hitPlayer > 70) {
            hitPlayer = random.nextInt(80, 100);
            System.out.println("Chachito ha lanzado su golpe critico 'Just a Few Scratches' con " + hitPlayer + " puntos de daño OUCHH");
        } else if (Player == 4 && Health < 50 && hitPlayer > 70) {
            hitPlayer = random.nextInt(100, 100);
            System.out.println("Dragon ha lanzado su golpe critico 'Family BBQ' con " + hitPlayer + " puntos de daño OUCHH");
        }
        return hitPlayer;
    }

    public static int attackPlayers(int Player) {
        int AttakPlayer = 0;
        if (Player == 1) {
            AttakPlayer = 95;
        } else if (Player == 2) {
            AttakPlayer = 55;
        } else if (Player == 3) {
            AttakPlayer = 85;
        } else if (Player == 4) {
            AttakPlayer = 85;
        }
        return AttakPlayer;
    }

    public static int defensePlayers(int Player) {
        int DefensePlayer = 0;
        if (Player == 1) {
            DefensePlayer = 90;
        } else if (Player == 2) {
            DefensePlayer = 100;
        } else if (Player == 3) {
            DefensePlayer = 120;
        } else if (Player == 4) {
            DefensePlayer = 100;
        }
        return DefensePlayer;
    }

    public static int speedPlayers(int Player) {
        int SpeedPlayer = 0;
        if (Player == 1) {
            SpeedPlayer = 80;
        } else if (Player == 2) {
            SpeedPlayer = 40;
        } else if (Player == 3) {
            SpeedPlayer = 90;
        } else if (Player == 4) {
            SpeedPlayer = 50;
        }
        return SpeedPlayer;
    }

    public static int healthPlayers(int Player) {
        int HealthPlayer = 0;
        if (Player == 1) {
            HealthPlayer = 110;
        } else if (Player == 2) {
            HealthPlayer = 150;
        } else if (Player == 3) {
            HealthPlayer = 100;
        } else if (Player == 4) {
            HealthPlayer = 120;
        }
        return HealthPlayer;
    }

    public static int healingPlayers(int Player) {
        int HealingPlayer = 0;
        if (Player == 1) {
            HealingPlayer = 110;
        } else if (Player == 2) {
            HealingPlayer = 150;
        } else if (Player == 3) {
            HealingPlayer = 100;
        } else if (Player == 4) {
            HealingPlayer = 120;
        }
        return HealingPlayer;
    }

    public static void asciiArtDraw() {
        System.out.println("Ambos jugadores caen al suelo exhaustos al superar el numero de rondas             //Introduce next para continuar//");
        next = shi.next().charAt(0);
        System.out.println("Se dan la mano pacificamente y se retiran del campo de batalla                //Introduce n para continuar");
        next = shi.next().charAt(0);
        System.out.println("""
                Have some Shrek of peace :)
                                       ⠀⢀⣠⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⢀⣴⠟⠉⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣀⢀⣾⠿⠻⢶⣄⠀⠀⣠⣶⡿⠶⣄⣠⣾⣿⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢻⣿⣿⡿⣿⠿⣿⡿⢼⣿⣿⡿⣿⣎⡟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡟⠉⠛⢛⣛⡉⠀⠀⠙⠛⠻⠛⠑⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣧⣤⣴⠿⠿⣷⣤⡤⠴⠖⠳⣄⣀⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣀⣟⠻⢦⣀⡀⠀⠀⠀⠀⣀⡈⠻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⠉⡇⠀⠀⠛⠛⠛⠋⠉⠉⠀⠀⠀⠹⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠈⠑⠪⠷⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣦⣼⠛⢦⣤⣄⡀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠢⡀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⠲⠖⠛⠻⣿⡿⠛⠉⠉⠻⠷⣦⣽⠿⠿⠒⠚⠋⠉⠁⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⢀⣾⠛⠁⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⠀⠀⠀
                ⠀⠀⠀⠀⣰⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣑⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀
                ⠀⠀⠀⣰⣿⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣧⣄⠀⠀⠀⠀⠀⠀⢳⡀⠀
                ⠀⠀⠀⣿⡾⢿⣀⢀⣀⣦⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⣫⣿⡿⠟⠻⠶⠀⠀⠀⠀⠀⢳⠀
                ⠀⠀⢀⣿⣧⡾⣿⣿⣿⣿⣿⡷⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⢀⡴⢿⣿⣧⠀⡀⠀⢀⣀⣀⢒⣤⣶⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇
                ⠀⠀⡾⠁⠙⣿⡈⠉⠙⣿⣿⣷⣬⡛⢿⣶⣶⣴⣶⣶⣶⣤⣤⠤⠾⣿⣿⣿⡿⠿⣿⠿⢿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇
                ⠀⣸⠃⠀⠀⢸⠃⠀⠀⢸⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⠟⡉⠀⠀⠀⠈⠙⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇
                ⠀⣿⠀⠀⢀⡏⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠛⠉⠁⠀⠀⠀⠀⠀⠉⠠⠿⠟⠻⠟⠋⠉⢿⣿⣦⡀⢰⡀⠀⠀⠀⠀⠀⠀⠁
                ⢀⣿⡆⢀⡾⠀⠀⠀⠀⣾⠏⢿⣿⣿⣿⣯⣙⢷⡄⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣿⣻⢿⣷⣀⣷⣄⠀⠀⠀⠀⢸⠀
                ⢸⠃⠠⣼⠃⠀⠀⣠⣾⡟⠀⠈⢿⣿⡿⠿⣿⣿⡿⠿⠿⠿⠷⣄⠈⠿⠛⠻⠶⢶⣄⣀⣀⡠⠈⢛⡿⠃⠈⢿⣿⣿⡿⠀⠀⠀⠀⠀⡀
                ⠟⠀⠀⢻⣶⣶⣾⣿⡟⠁⠀⠀⢸⣿⢅⠀⠈⣿⡇⠀⠀⠀⠀⠀⣷⠂⠀⠀⠀⠀⠐⠋⠉⠉⠀⢸⠁⠀⠀⠀⢻⣿⠛⠀⠀⠀⠀⢀⠇
                ⠀⠀⠀⠀⠹⣿⣿⠋⠀⠀⠀⠀⢸⣧⠀⠰⡀⢸⣷⣤⣤⡄⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡆⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⢼⡇
                ⠀⠀⠀⠀⠀⠙⢻⠄⠀⠀⠀⠀⣿⠉⠀⠀⠈⠓⢯⡉⠉⠉⢱⣶⠏⠙⠛⠚⠁⠀⠀⠀⠀⠀⣼⠇⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⡇
                ⠀⠀⠀⠀⠀⠀⠻⠄⠀⠀⠀⢀⣿⠀⢠⡄⠀⠀⠀⣁⠁⡀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⢀⣐⡟⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⢠⡇""");
    }

    public static int damagePlayers(int Health, int Damage) {
        return Health = Health - Damage;
    }

    public static int HealingPlayer(int Health, int Healing) {
        return Health = Health + Healing;
    }

    public static int MaximumHealthPlayers(int Health, int ReHealing) {
        if (Health > ReHealing) {
            Health = ReHealing;
        }
        return Health;
    }

    public static int MinimumHealthPlayers(int Health) {
        if (Health < 0) {
            Health = 0;
        }
        return Health;
    }

    public static void CharactersMenu() {
        System.out.println("Elije un personaje a continuacion: ");
        System.out.print("HARLEY QUINN");
        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠤⠤⣀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⣠⠖⠋⣉⡠⠤⠬⠿⠶⣄⡀⣀⠴⠋⢀⣤⠖⠒⠢⣍⠳⢏⣅⠀⠈⠑⢦⡀⠀⣀⣠⠤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⢀⠔⢁⠔⠋⠀⠀⣀⣠⣶⣶⣶⣿⠯⢄⣴⠟⠁⠀⠀⠀⣀⠙⠪⣻⡀⠀⣀⠤⠿⠯⣕⠒⠒⠲⢌⣳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⢠⣮⠖⠁⠀⢀⠴⢊⠕⣹⠛⢡⠞⠉⣷⡿⠃⠀⠀⢀⡴⠋⠉⠒⠢⢌⡷⢊⣀⠤⢤⣀⡈⢷⢄⠀⠀⠈⢻⣦⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢀⡿⠃⠀⠀⡰⠋⣰⠋⣰⠁⣰⠋⢀⡞⡹⠁⠀⠀⣠⡟⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠻⣧⠘⡌⢧⠀⠀⠀⠙⡆⠀⠀⠀⠀⠀⠀⠀
                ⠀⡼⠁⠀⠀⡴⠁⣰⠃⢀⡇⢰⠇⠀⡜⢠⠇⠀⠀⡼⢹⠄⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡇⢡⠘⡄⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀
                ⣼⠁⠀⠀⣸⠁⢠⡏⠀⢸⠁⢸⠀⢰⠁⢸⠀⠀⢰⣧⣀⣴⣦⣬⣳⡀⠀⠀⠀⠀⠀⢀⣠⣖⣻⣷⢸⠀⡇⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀
                ⣿⠀⠀⢠⡇⠀⣾⠀⠀⢿⡆⠈⢆⣾⡄⠘⡄⠀⢸⠈⢻⡀⠠⠤⡙⢿⠒⠀⠀⢀⣴⢛⡉⠛⣿⠉⢸⠀⡇⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀
                ⣿⠀⠀⢸⠀⠀⣿⠀⣠⣼⣷⠀⠸⠀⢷⠀⢣⠀⠘⡄⢈⠉⠓⠒⠓⠋⠁⠀⠀⠘⠧⠤⠤⠼⡇⠀⢸⣿⠁⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀
                ⣿⡀⠀⢸⠀⠀⣿⣿⣿⣿⣿⣧⠀⢧⠀⢧⠘⡆⠀⡇⡎⠀⠀⠀⠀⠀⠀⣠⡀⠳⡄⠀⠀⠀⣧⢀⣿⠏⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠀⠀
                ⣿⣧⠀⢸⠀⠀⢸⣿⣿⣿⣿⣿⣷⣄⡙⠺⡆⢱⠀⡇⣇⠀⠀⠀⠀⠀⠀⠙⠛⠚⠁⠀⠀⢰⠏⣼⠏⠀⠀⢀⣾⠋⠀⠀⠀⠀⠀⠀⠀⠀
                ⠉⠙⠳⣼⣇⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣓⣧⢸⠀⡇⢸⠀⠀⠘⠻⣶⣶⣶⣶⣶⡶⠃⣠⡏⣼⠏⠀⢀⣴⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠈⠻⢬⡦⣸⣿⣿⣿⣿⣿⣿⣷⣈⣿⠀⢠⣷⣬⣧⠀⠀⠀⠀⠉⠙⠛⠉⢀⡜⡁⣼⡏⠀⣠⠏⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠙⢌⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣾⣿⠀⠙⠣⢄⡀⠀⠀⠀⢀⡴⠛⡀⣼⢻⠀⢠⡇⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⢈⣿⣿⣿⣿⣿⣿⡏⠈⠹⡼⠿⣷⣄⠀⠀⠤⣈⡙⢲⣶⣯⣄⡀⢳⠛⣼⡄⠀⢧⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡇⠀⠀⠃⣰⣿⣿⣿⣶⣤⣤⡤⢾⣿⣝⣿⣿⣷⣦⣬⣧⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣷⣶⣶⣯⠙⠿⣿⣿⣿⣿⣿⡄⢸⣿⢿⣿⣿⣿⣿⣿⣿⣿⣶⣼⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⠀⠀⠀⣠⠖⠋⣩⠟⠛⠿⣿⣿⣿⠉⢉⡇⠀⠀⠉⠙⠛⠻⠷⠔⠋⠀⠹⣿⠿⢿⡿⢿⣿⣿⣿⣿⣷⣦⣄⣀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠀⢀⡴⢊⡤⠒⠉⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣦⣄⣽⡀⠈⠉⢻⡿⢿⣿⣿⣿⣿⣶⣤⡀⠀⠰⠠
                ⠀⢀⠴⠋⠔⠋⠀⠀⠀⠀⠀⠀⠀⢠⡿⢻⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣧⠀⠀⠀⢷⡀⢈⣙⣻⣟⠉⣉⠁⠀⠀⠀
                ⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⣸⣿⣿⣿⣿⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣇⠀⠀⢸⡟⣿⠉⠉⣿⣿⣿⣶⣦⣀⡴
                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⢇⠀⠀⣹⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣷⡄⢸⡇⡟⠀⠀⠙⣮⢿⣿⣿⣿⣿
                ⠀⠀⠀⠀⠀⠀⠀⢀⣤⡎⠁⠀⠀⢁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣾⣷⡇⠀⠀⠀⠙⣧⣿⣿⣿⣿
                ⠀⠀⠀⠀⣀⡤⠞⠛⠀⢹⣦⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢇⣤⣀⣀⣠⠃⠙⠻⠿⡏
                ⣀⣠⡔⡋⠁⠀⢀⡀⠐⠃⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠈⡇⠹⠁⠀⢨⠏⠀⠀⠀⠀⠁""");
        System.out.println("Las estadisticas de Harley Quinn son :\n Vida : 110pt \n Ataque : 120pt \n Defensa : 90 pt \n Velocidad : 80pt \n Curacion : 100pt \n Golpe Critico : 'Clown Strike'");
        System.out.println("\n Introduce cualquier letra para ver el siguiente personaje");
        next = shi.next().charAt(0);
        System.out.println("ZOMBIE");
        System.out.println(
                """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶⡶⠶⠶⠾⠿⠿⠿⠟⠿⠿⠿⠿⣷⠶⣶⣦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡾⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠞⠁⠀⠀⠀⠉⠛⢿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡾⠛⠁⡀⠀⠀⠀⠀⣴⡶⠶⠶⠶⢤⣄⠀⠀⠀⠀⠀⠙⠒⠲⠤⠤⢤⣤⣤⡤⠤⠖⠚⠛⠻⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠏⣰⠎⣩⠇⠀⠀⠀⠀⠷⠒⠒⠒⠲⢶⣬⡙⢦⡀⠀⠀⠀⣠⠴⢦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡟⠁⢀⣉⡍⠁⠀⣠⠀⠀⠀⣀⣀⣀⣠⣤⡤⠬⣿⣷⣅⠀⠰⣞⠀⢀⡴⠁⣀⡴⠶⣀⣀⡀⠀⠀⠀⠀⠀⠀⠹⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠟⠀⣴⢋⣨⠃⠀⡴⣃⣤⠾⠟⠛⠉⠀⠀⠀⠀⠀⠀⠈⢿⡍⠀⠀⠉⢉⣠⢜⣵⠞⠋⠉⠐⢾⣇⠀⠀⣤⠖⠲⡄⠙⣷⡀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡟⠀⣀⣛⣋⠁⠀⣸⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⠀⠀⠀⠈⣹⡟⠓⠢⢤⣄⠀⠀⠹⣧⡸⣅⣠⡴⡃⠀⢹⣧⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡷⠊⠁⢨⡇⠀⢰⡏⠀⠀⠀⠀⠀⢠⡶⣿⣿⣷⡀⠀⠀⠀⢠⣿⠀⠀⠀⢰⡿⠀⠀⠀⠀⠉⠻⣦⡀⠉⢱⠀⢠⠟⠙⣦⠀⢿⡄⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⣴⠏⠀⠀⢸⡇⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⡇⠀⠀⠀⢸⡟⠀⠀⠀⣾⠁⠀⠀⠀⣤⣶⣤⡈⠻⣦⣸⠀⡏⠀⠀⣸⠀⢸⡇⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣤⠞⠁⠀⠀⠀⢸⣇⠀⠀⠀⠀⠀⢿⣿⣿⣿⠟⠀⠀⠀⢀⣿⠁⠀⠀⢸⣿⣄⠀⠀⠸⣿⣾⣿⡇⠀⠈⢿⡀⢧⣀⡴⠃⠀⢸⡇⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⣿⡇⠐⡇⡀⠀⠀⢸⣿⣆⠀⠀⠀⠀⠈⢙⣛⣁⣠⣤⡴⢶⣿⠇⠀⠀⠀⠸⣿⣿⣦⡀⠀⠙⠛⠋⠀⠀⢀⣾⢷⠀⠀⠀⠀⠀⢸⡇⢀⣠⣤⣤⣤⡀
                        ⠀⣠⡶⠋⠉⠉⠉⠛⠶⣤⣹⣇⠘⡽⡁⠀⠀⠘⣷⡙⢷⣶⡶⠞⠛⠛⠛⠉⠉⠀⣠⣾⠏⠀⣀⠀⣠⠀⢹⣿⣿⣿⣶⣦⠀⠀⠀⢀⣾⠇⠈⠀⠀⠀⠀⠀⣼⡗⠋⠉⠀⠀⠹⣿
                        ⢰⠏⠀⠀⠀⠀⣀⣀⣀⠈⠙⣿⡄⠹⡄⠀⠀⠀⠘⣷⣄⠙⠛⠷⣶⣤⣤⣤⣶⠟⣿⠏⠀⣰⣿⠀⣿⣧⠀⢿⡿⣿⣿⣿⣤⣤⣶⡿⠁⠀⢀⡰⣄⠀⠀⢰⣿⠖⠚⢦⠀⠀⣼⡟
                        ⣾⠀⠀⠀⠀⡿⠋⢉⣽⣷⡄⠘⣿⡆⣧⠀⠀⠀⠀⠀⠉⠻⠶⠦⠤⠴⠆⣀⣴⠾⠃⠀⣴⣿⣿⠀⣿⣿⣇⠀⠙⢶⣯⣝⡽⣭⠞⠁⠀⣆⠢⡘⠆⠀⢠⣿⢋⣉⡀⠈⢀⣾⠟⠀
                        ⠸⣦⡤⢤⣄⠷⡀⢸⣀⡘⣿⠀⠈⢻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠋⠉⠀⠀⠀⠰⠿⠿⠿⠀⠿⠿⠟⠀⠀⠙⠢⠴⠚⠁⠀⠀⠀⠈⠙⢀⠠⣴⡿⣧⣈⣼⠇⠀⣾⠃⠀⠀
                        ⠀⠈⠁⠈⠛⠟⣧⠈⢿⡾⠏⠀⠀⣸⠏⠻⣦⣧⣄⠀⠀⠀⠀⠀⢤⢤⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⢫⣾⣿⣅⡈⠉⢽⣿⣰⡟⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⢫⡇⠀⠀⠀⢀⣴⠟⠀⠀⠀⠉⢻⣆⠀⠀⠀⠀⠈⠳⡝⠑⠀⠀⠀⣠⣤⣶⣶⠶⢶⣶⣦⣤⣄⠀⠀⣀⣀⢤⣄⠀⠀⣰⡿⠟⠉⠉⠙⠻⠿⢾⣿⠟⠁⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠉⠓⠒⠚⠋⠉⠀⠀⠀⠀⠀⠈⣿⡇⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣫⡵⣧⠀⠀⠀⢰⣦⣉⣙⢿⣦⡀⠉⠻⠮⠁⢸⡿⠀⠀⠀⠀⠀⠀⢀⣸⣿⣀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡏⠀⢿⣶⣶⣤⣏⠀⣿⠹⣷⣿⣷⡀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⢾⢴⣶⡾⡇⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡇⠀⠀⠀⠀⢀⣾⣿⣿⣿⣷⣶⣾⣿⣿⣿⣿⣤⣿⣶⣿⣿⣿⣷⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠈⣷⣶⣶⠃⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡿⢿⣿⣿⣿⣿⣿⣿⡆⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⠀⢀⡄⠀⢸⣿⣿⣿⣿⠙⣿⣿⠿⣷⢸⡇⢸⠿⣿⣿⣿⣿⡿⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⣿⠂⠀⢸⣿⠋⠉⠹⠶⠿⠆⠀⠈⢉⣉⣙⣀⠀⠉⢙⣿⠃⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⣿⠀⠀⠀⠻⣷⣀⣠⣴⣶⠾⠿⠟⠛⠛⠉⠉⠙⠛⠛⠷⢦⣄⡀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡇⠘⠀⣀⣴⡾⠟⠛⠉⠀⠀⠀⠀⠀⠀⠠⠞⠋⠉⠛⠳⣦⡀⠀⠙⠂⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⡀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣶⠀⠘⠃⠀⠀⣰⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠶⢶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⢀⣀⣤⣤⡶⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠷⠶⠶⠶⠶⠶⠶⠶⠿⠿⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""");
        System.out.println("Las estadisticas de Zombie son :\n Vida : 150pt \n Ataque : 80pt \n Defensa : 100pt \n Velocidad : 40pt \n Curacion : 120pt \n Golpe Critico : 'The Bite of Death'");
        System.out.println("\n Introduce cualquier letra para ver el siguiente personaje");
        next = shi.next().charAt(0);
        System.out.println("CHACHITO");
        System.out.println(
                """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠋⠈⠻⣮⣳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡿⠋⠀⠀⠀⠀⠙⣿⣿⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣿⡿⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠿⠿⣿⣷⣶⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠿⣿⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⣀⣠⣤⣤⣀⡀⠀⠀⣀⣴⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣄⠀⠀
                        ⢀⣤⣾⡿⠟⠛⠛⢿⣿⣶⣾⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣿⣷⣦⣀⣀⣤⣶⣿⡿⠿⢿⣿⡀⠀
                        ⣿⣿⠏⠀⢰⡆⠀⠀⠉⢿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢿⡿⠟⠋⠁⠀⠀  ⢸⣿⠇⠀
                        ⣿⡟⠀⣀⠈⣀⡀⠒⠃⠀⠙⣿⡆⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠇⠀
                        ⣿⡇⠀⠛⢠⡋⢙⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀
                        ⣿⣧⠀⠀⠀⠓⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠋⠀⠀⢸⣧⣤⣤⣶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡿⠀⠀
                        ⣿⣿⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠻⣷⣶⣶⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠁⠀⠀
                        ⠈⠛⠻⠿⢿⣿⣷⣶⣦⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡏⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠻⠿⢿⣿⣷⣶⣦⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⡄⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠻⠿⢿⣿⣷⣶⣦⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⡄⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠿⠿⣿⣷⣶⣶⣤⣤⣀⡀⠀⠀⠀⢀⣴⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⡿⣄
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠿⠿⣿⣷⣶⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣹
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀⠀⠀⢸⣧
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣆⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣤⣄⣀⡀⠀⠀⠀⣿
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣻⣷⣶⣾⣿⣿⡿⢯⣛⣛⡋⠁⠀⠀⠉⠙⠛⠛⠿⣿⣿⡷⣶⣿""");
        System.out.println("Las estadisticas de Chachito son :\n Vida : 100pt \n Ataque : 100pt \n Defensa : 120pt \n Velocidad : 90pt \n Curacion : 100pt \n Golpe Critico : 'Just a Few Scratches'");
        System.out.println("\n Introduce cualquier letra para ver el siguiente personaje");
        next = shi.next().charAt(0);
        System.out.println("DRAGON");
        System.out.println(
                """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⡼⠀⢀⡀⣀⢱⡄⡀⠀⠀⠀⢲⣤⣤⣤⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⣿⡿⠛⠋⠁⣤⣿⣿⣿⣧⣷⠀⠀⠘⠉⠛⢻⣷⣿⣽⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⢀⣴⣞⣽⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠠⣿⣿⡟⢻⣿⣿⣇⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣟⢦⡀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⣠⣿⡾⣿⣿⣿⣿⣿⠿⣻⣿⣿⡀⠀⠀⠀⢻⣿⣷⡀⠻⣧⣿⠆⠀⠀⠀⠀⣿⣿⣿⡻⣿⣿⣿⣿⣿⠿⣽⣦⡀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⣼⠟⣩⣾⣿⣿⣿⢟⣵⣾⣿⣿⣿⣧⠀⠀⠀⠈⠿⣿⣿⣷⣈⠁⠀⠀⠀⠀⣰⣿⣿⣿⣿⣮⣟⢯⣿⣿⣷⣬⡻⣷⡄⠀⠀⠀
                        ⠀⠀⢀⡜⣡⣾⣿⢿⣿⣿⣿⣿⣿⢟⣵⣿⣿⣿⣷⣄⠀⣰⣿⣿⣿⣿⣿⣷⣄⠀⢀⣼⣿⣿⣿⣷⡹⣿⣿⣿⣿⣿⣿⢿⣿⣮⡳⡄⠀⠀
                        ⠀⢠⢟⣿⡿⠋⣠⣾⢿⣿⣿⠟⢃⣾⢟⣿⢿⣿⣿⣿⣾⡿⠟⠻⣿⣻⣿⣏⠻⣿⣾⣿⣿⣿⣿⡛⣿⡌⠻⣿⣿⡿⣿⣦⡙⢿⣿⡝⣆⠀
                        ⠀⢯⣿⠏⣠⠞⠋⠀⣠⡿⠋⢀⣿⠁⢸⡏⣿⠿⣿⣿⠃⢠⣴⣾⣿⣿⣿⡟⠀⠘⢹⣿⠟⣿⣾⣷⠈⣿⡄⠘⢿⣦⠀⠈⠻⣆⠙⣿⣜⠆
                        ⢀⣿⠃⡴⠃⢀⡠⠞⠋⠀⠀⠼⠋⠀⠸⡇⠻⠀⠈⠃⠀⣧⢋⣼⣿⣿⣿⣷⣆⠀⠈⠁⠀⠟⠁⡟⠀⠈⠻⠀⠀⠉⠳⢦⡀⠈⢣⠈⢿⡄
                        ⣸⠇⢠⣷⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⠿⠋⠀⢻⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢾⣆⠈⣷
                        ⡟⠀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣤⡀⢸⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⢹
                        ⡇⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠈⣿⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⢸
                        ⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠶⣶⡟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼
                        ⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡁⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣼⣀⣠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""");


        System.out.println("Las estadisticas de Dragon son :\n Vida : 120pt \n Ataque : 100pt \n Defensa : 120pt \n Velocidad : 50pt \n Curacion : 120pt \n Golpe Critico : 'Family BBQ'");
    }

    public static void player1Selection(int Player1) {
        if (Player1 == 1) {
            System.out.println("Jugador 1 ha elegido a Harley Quinn");
            AttackPlayer1 = attackPlayers(Player1);
            DefensePlayer1 = defensePlayers(Player1);
            HealthPlayer1 = healthPlayers(Player1);
            SpeedPlayer1 = speedPlayers(Player1);
            HealingPlayer1 = healingPlayers(Player1);
            ReHealthPlayer1 = healthPlayers(Player1);
        } else if (Player1 == 2) {
            System.out.println("Jugador 1 ha elegido a Zombie");
            AttackPlayer1 = attackPlayers(Player1);
            DefensePlayer1 = defensePlayers(Player1);
            HealthPlayer1 = healthPlayers(Player1);
            SpeedPlayer1 = speedPlayers(Player1);
            HealingPlayer1 = healingPlayers(Player1);
            ReHealthPlayer1 = healthPlayers(Player1);
        } else if (Player1 == 3) {
            System.out.println("Jugador 1 ha elegido a Chachito");
            AttackPlayer1 = attackPlayers(Player1);
            DefensePlayer1 = defensePlayers(Player1);
            HealthPlayer1 = healthPlayers(Player1);
            SpeedPlayer1 = speedPlayers(Player1);
            HealingPlayer1 = healingPlayers(Player1);
            ReHealthPlayer1 = healthPlayers(Player1);
        } else if (Player1 == 4) {
            System.out.println("Jugador 1 ha elegido a Dragon");
            AttackPlayer1 = attackPlayers(Player1);
            DefensePlayer1 = defensePlayers(Player1);
            HealthPlayer1 = healthPlayers(Player1);
            SpeedPlayer1 = speedPlayers(Player1);
            HealingPlayer1 = healingPlayers(Player1);
            ReHealthPlayer1 = healthPlayers(Player1);
        }
    }

    public static void Player2Selection(int Player2) {
        if (Player2 == 1) {
            System.out.println("Jugador 2 ha elegido a Harley Quinn");
            AttackPlayer2 = attackPlayers(Player2);
            DefensePlayer2 = defensePlayers(Player2);
            HealthPlayer2 = healthPlayers(Player2);
            SpeedPlayer2 = speedPlayers(Player2);
            HealingPlayer2 = healingPlayers(Player2);
            ReHealthPlayer2 = healthPlayers(Player2);
        } else if (Player2 == 2) {
            System.out.println("Jugador 2 ha elegido a Zombie");
            AttackPlayer2 = attackPlayers(Player2);
            DefensePlayer2 = defensePlayers(Player2);
            HealthPlayer2 = healthPlayers(Player2);
            SpeedPlayer2 = speedPlayers(Player2);
            HealingPlayer2 = healingPlayers(Player2);
            ReHealthPlayer2 = healthPlayers(Player2);
        } else if (Player2 == 3) {
            System.out.println("Jugador 2 ha elegido a Chachito");
            AttackPlayer2 = attackPlayers(Player2);
            DefensePlayer2 = defensePlayers(Player2);
            HealthPlayer2 = healthPlayers(Player2);
            SpeedPlayer2 = speedPlayers(Player2);
            HealingPlayer2 = healingPlayers(Player2);
            ReHealthPlayer2 = healthPlayers(Player2);
        } else if (Player2 == 4) {
            System.out.println("Jugador 2 ha elegido a Dragon");
            AttackPlayer2 = attackPlayers(Player2);
            DefensePlayer2 = defensePlayers(Player2);
            HealthPlayer2 = healthPlayers(Player2);
            SpeedPlayer2 = speedPlayers(Player2);
            HealingPlayer2 = healingPlayers(Player2);
            ReHealthPlayer2 = healthPlayers(Player2);
        }
    }

    public static void PlayerTurns(int DecisionRound, int HitPlayer, int Player, int HealthPlayerFunction1,int HealthPlayerFunction2, int HealingPlayer, int ReHealthPlayer, int HealPlayer) {
        if (Player == 1) {
            if (DecisionRound == 1) {
                System.out.println("El jugador 1 se prepara para atacar!!              //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
                System.out.println("El jugador 1 ha atacado al Jugador 2 con " + HitPlayer + " puntos de daño");
                HitPlayer = habilityPlayers(Player, HealthPlayerFunction1, HitPlayer);
                HealthPlayerFunction2 = damagePlayers(HealthPlayerFunction2, HitPlayer);
                HealthPlayerFunction2 = MinimumHealthPlayers(HealthPlayerFunction2);
                HealthPlayer2 = HealthPlayerFunction2;
                System.out.println("Al jugador 2 le quedan " + HealthPlayer2 + " puntos de vida             //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);

            } else if (DecisionRound == 2) {
                HealthPlayerFunction1 = HealingPlayer(HealthPlayerFunction1, HealingPlayer);
                HealthPlayerFunction1 = MaximumHealthPlayers(HealthPlayerFunction1, ReHealthPlayer);
                HealthPlayer1 = HealthPlayerFunction1;
                System.out.println("El jugador 1 va en busca de una pocion         //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
                System.out.println("El jugador 1 ha encontrado una pocion de " + HealPlayer + " puntos de vida, por lo que su salud aumenta a " + HealthPlayer1 + "           //Introduce cualquier letra para continuar// ");
                next = shi.next().charAt(0);
            }
        } else if (Player == 2) {
            if (DecisionRound == 1) {
                System.out.println("El jugador 2 se prepara para atacar!!              //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
                System.out.println("El jugador 2 ha atacado a el Jugador 1 con " + HitPlayer + " puntos de daño");
                HitPlayer = habilityPlayers(Player, HealthPlayerFunction2, HitPlayer);
                HealthPlayerFunction1 = damagePlayers(HealthPlayerFunction1, HitPlayer);
                HealthPlayerFunction1 = MinimumHealthPlayers(HealthPlayerFunction1);
                HealthPlayer1 = HealthPlayerFunction1;
                System.out.println("Al jugador 1 le quedan " + HealthPlayer1 + " puntos de vida                 //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);

            } else if (DecisionRound == 2) {
                HealthPlayerFunction2 = HealingPlayer(HealthPlayerFunction2, HealingPlayer);
                HealthPlayerFunction2 = MaximumHealthPlayers(HealthPlayerFunction2, ReHealthPlayer);
                HealthPlayer2 = HealthPlayerFunction2;
                System.out.println("El jugador 2 va en busca de una pocion         //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
                System.out.println("El jugador 2 ha encontrado una pocion de " + HealPlayer + " puntos de vida, por lo que su salud aumenta a " + HealthPlayer2 + "          //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
            }
        }
    }
    public static void main(String[] args) {
        Scanner shi = new Scanner(System.in);

        int Round = 2;

        CharactersMenu();
        System.out.println("Introduce cualquier letra para elegir un personaje");
        next = shi.next().charAt(0);

        System.out.println(" - JUGADOR 1 - \n MENU DE ELECCION : \n 1. Harley Quinn \n 2. Zombie \n 3. Chachito \n 4. Dragon");
        System.out.print("\n Introduzca un numero por pantalla:");
        int Player1 = shi.nextInt();
        System.out.println(" - JUGADOR 2 - \n MENU DE ELECCION : \n 1. Harley Quinn \n 2. Zombie \n 3. Chachito \n 4. Dragon");
        System.out.print("\n Introduzca un numero por pantalla:");
        int Player2 = shi.nextInt();

        player1Selection(Player1);
        Player2Selection(Player2);

        System.out.println("Va a comenzar el combate, estan preparados?.... Introduzca next por consola");
        next = shi.next().charAt(0);

        int damagePlayer1 = random.nextInt(120);
        int damagePlayer2 = random.nextInt(120);

        if (SpeedPlayer1 > SpeedPlayer2) {
            System.out.println("El Jugador 1 ha sido mas rapido que el Jugador 2, por lo que este atacara primero       //Introduce cualquier letra para continuar//");
            next = shi.next().charAt(0);
            if (AttackPlayer1 > DefensePlayer2) {
                System.out.println("El Jugador 1 encontro el punto debil del Jugador 2!!");
                next = shi.next().charAt(0);
                HealthPlayer2 = damagePlayers(HealthPlayer2, damagePlayer1);
                System.out.println("El Jugador 2 ha sufrido una perdida de " + damagePlayer1 + " puntos de daño");
                System.out.println("Al jugador 2 le quedan " + HealthPlayer2 + " puntos de vida OUCH     //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
            } else {
                System.out.println("El Jugador 2 se ha defendido y no ha sufrido ningun daño!! ");
            }
        } else if (SpeedPlayer2 > SpeedPlayer1) {
            System.out.println("El Jugador 2 ha sido mas rapido que el Jugador 1, por lo que este atacara primero   //Introduce cualquier letra para continuar// ");
            next = shi.next().charAt(0);
            if (AttackPlayer2 > DefensePlayer1) {
                System.out.println("El Jugador 2 encontro el punto debil del Jugador 1!!    //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
                HealthPlayer1 = damagePlayers(HealthPlayer1, damagePlayer2);
                System.out.println("El Jugador 2 ataqua al Jugador 1 con " + damagePlayer2 + " puntos de daño");
                System.out.println("Al jugador 1 le quedan " + HealthPlayer1 + " puntos de vida OUCH     //Introduce cualquier letra para continuar//");
                next = shi.next().charAt(0);
            } else {
                System.out.println("El Jugador 1 se ha defendido y no ha sufrido ningun daño!! ");
            }
        }
        System.out.println("Se ha realizado la primera ronda");
        System.out.println("Al Jugador 1 le quedan " + HealthPlayer1 + " puntos de vida ");
        System.out.println("Al Jugador 2 le quedan " + HealthPlayer2 + " puntos de vida");
        System.out.println(" //Introduce cualquier letra para continuar// ");
        next = shi.next().charAt(0);

        while (HealthPlayer2 > 0 && HealthPlayer1 > 0) {

            int HealPlayer1 = random.nextInt(HealingPlayer1);
            int HealPlayer2 = random.nextInt(HealingPlayer2);
            int HitPlayer1 = random.nextInt(AttackPlayer1);
            int HitPlayer2 = random.nextInt(AttackPlayer2);

            int DecisionRound = 0;

            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                System.out.println("Es el turno del Jugador 1, puede decidir si atacar o curarse, que hace?");
                System.out.println("\n 1. Atacar \n 2. Regenerarse");
                System.out.print("\n Introduzca un numero por pantalla: ");
                DecisionRound = shi.nextInt();
                Player = 1;
                PlayerTurns(DecisionRound,HitPlayer1,Player,HealthPlayer1,HealthPlayer2,HealingPlayer1,ReHealthPlayer1,HealPlayer1);
            }
            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                System.out.println("Es el turno de el Jugador 2, puede decidir si atacar o curarse, que hace?");
                System.out.println("\n 1. Atacar \n 2. Curarse");
                System.out.print("\n Introduzca un numero por pantalla: ");
                DecisionRound = shi.nextInt();
                Player = 2;
                PlayerTurns(DecisionRound,HitPlayer2,Player,HealthPlayer1,HealthPlayer2,HealingPlayer2,ReHealthPlayer2,HealPlayer2);
            }
            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                System.out.println("Se han realizado " + Round + " rondas");


                System.out.println("Vida JUGADOR 1");
                for (int i = 1; i <= HealthPlayer1; i++) {
                    System.out.print("♡");
                }
                System.out.println(" //Introduce cualquier letra para continuar// ");
                next = shi.next().charAt(0);
                System.out.println("Vida JUGADOR 2");
                for (int i = 1; i <= HealthPlayer2; i++) {
                    System.out.print("♡");
                }
                System.out.println(" // Introduce cualquier letra para continuar // ");
                next = shi.next().charAt(0);
                AttackPlayer2 = attackPlayers(Player2);
            }


            if (HealthPlayer2 <= 0 || HealthPlayer1 <= 0 || Round > 10) {
                if (HealthPlayer2 <= 0) {
                    System.out.println("El jugador 2 ve su vida reducida a 0         //Introduce cualquier letra para continuar//");
                    showAsciiArtWinner();
                    System.out.println("EL JUGADOR 1 GANA LA PARTIDA");
                    break;
                } else if (HealthPlayer1 <= 0) {
                    System.out.println("El jugador 1 ve su vida reducida a 0         //Introduce cualquier letra para continuar//");
                    showAsciiArtWinner();
                    System.out.println("EL JUGADOR 2 GANA LA PARTIDA");
                    break;
                } else if (Round == 10) {
                    asciiArtDraw();
                    break;
                }
            }
            Round++;
        }
    }
}





