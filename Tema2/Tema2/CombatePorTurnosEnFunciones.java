package Tema2;

import java.util.Random;
import java.util.Scanner;

public class CombatePorTurnosEnFunciones {

    public static void showAsciiArtWinner() {
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
        /*
    public static int HabilitysCharacters(int Health1, int Health2) {


    }
    */
    public static void main(String[] args) {
        Scanner shi = new Scanner(System.in);

        int Round = 2;
///////////////////////////////
        int AttakPlayer1 = 0;
        int DefensePlayer1 = 0;
        int SpeedPlayer1 = 0;
        int HealthPlayer1 = 0;
        int ReHealthPlayer1 = 0;
///////////////////////////////
        int AttakPlayer2 = 0;
        int DefensePlayer2 = 0;
        int SpeedPlayer2 = 0;
        int HealthPlayer2 = 0;
        int ReHealthPlayer2 = 0;

        char next;

        System.out.println("Elije un personaje a continuacion: ");
        System.out.print("HARLEY QUINN");
        System.out.println(
                """
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⢀⣠⣴⣶⣾⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⣀⡀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⡿⠟⠉⢹⡆
                        ⠀⠀⠀⠀⢀⣠⣤⣤⣤⣀⡠⠖⢚⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⢧⣀⣘⠿⠃
                        ⠀⠀⢀⡴⠋⠀⠀⠀⣠⠟⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀
                        ⠀⠀⣼⠁⠀⠀⠀⢠⡏⠀⠀⢸⣿⣿⣿⡿⠿⠿⠛⠛⢿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⢰⡏⠀⣀⣤⣄⣸⡇⣀⡤⠞⠋⠉⣠⣴⣿⣶⣶⣤⣸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣠⠻⣧⢾⡁⠀⠀⠸⣿⣥⣀⣀⣴⣾⣿⣋⡤⢭⣿⣿⡇⢿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⢇⣀⣐⣼⠟⠀⠀⢀⢹⡟⡛⣿⣿⣿⣿⣤⣽⣿⣿⠟⠀⠸⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠉⠉⠁⠀⠀⠀⠈⢹⣯⣿⡟⠉⠙⠛⠛⠛⠋⠁⠀⠀⠀⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢸⠛⠉⠀⣀⣀⣤⣤⡤⠤⣼⠂⠀⠀⢸⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⢸⡄⠐⢿⡋⠉⠀⠀⢀⣴⠇⠀⠀⠀⣼⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡄⠀⢹⣦⣴⣾⠙⠁⠀⠀⢀⣼⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠲⣄⣉⣁⡀⢀⣀⣤⣶⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠔⠋⠉⠀⠉⠉⠻⣿⠿⠿⠿⠿⢿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⠀⠀⣠⠼⠢⡀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⠀⣸⠃⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠈⠳⠛⠇⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⠀⠀⠀⠀⣠⡏⠀⠀⠀⠀⢀⡀⠀⣸⣇⣀⣴⠛⢦⡄⠀⠘⠓⠦⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⠀⠀⣀⡤⠴⠋⣸⠁⠀⠀⠀⢠⢏⡇⠀⠻⢤⠟⠉⢠⠞⠁⠀⣀⣤⡀⠀⠈⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
                        ⣰⠋⠁⠀⠀⢰⠏⠀⠀⠀⢀⡞⣼⠀⠀⣰⠒⠀⠀⠸⡄⠀⠀⣿⣿⠷⢤⣴⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀
                        ⢿⠀⠀⠀⢀⡟⠀⠀⠀⢀⡞⣰⠃⠀⣼⠃⠀⠀⠀⢰⡛⢲⣶⣿⣿⣀⢀⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀
                        ⠘⣆⠀⠐⣿⠁⠀⠀⢀⡜⣰⠃⠀⡼⠁⠀⠀⠀⠀⢠⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀
                        ⠀⠈⣷⢰⠇⠀⠀⢀⡞⡰⠃⢀⡼⠁⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀
                        ⠀⢸⣷⠟⠀⠀⢠⢞⡜⠁⢀⡞⠁⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀
                        ⠀⣾⠏⠀⠀⢠⢯⠞⠀⢀⣾⣤⣤⣄⣠⣾⣿⣿⣿⣿⣿⣿⠟⠋⠘⣿⠉⠻⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀
                        ⣰⡋⠀⠀⠀⠀⠃⠀⢀⣾⣿⣿⡿⠋⠉⠙⠻⣿⡿⠟⠋⠁⠀⠀⠀⠘⣧⡀⣿⡟⢿⣿⣿⣿⣇⠀⠀⠀⠀
                        ⢱⡇⠀⠀⢀⠀⢀⣴⣿⣿⠟⠉⠀⠀⣠⡴⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣇⡈⣿⣿⡿⣿⡄⠀⠀⠀
                        ⠀⠙⠛⠋⠉⣠⣾⣿⡿⠃⠀⢀⡴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⠛⠿⣿⠀⠉⠣⠀⠀⠀
                        ⠀⠀⠀⠀⠘⠉⠀⠉⠀⠀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠂⠀⠀⠀⠀⠀⠀⠀⠀""");
        System.out.println("Las estadisticas de Harley Quinn son :\n Velocidad : 100pt \n Ataque : 150pt \n Defensa : 90 pt \n Vida : 150pt ");

        System.out.println("Introduce next para ver el siguiente personaje");
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

        System.out.println("Las estadisticas del Zombie son : \n Velocidad : 80pt \n Ataque : 50pt \n Defensa : 100pt \n Vida : 150pt \n ");

        System.out.println("Introduce next para ver el siguiente personaje");
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
                        ⣿⣿⠏⠀⢰⡆⠀⠀⠉⢿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢿⡿⠟⠋⠁⠀⠀⢸⣿⠇⠀
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

        System.out.println("Las estadisticas de Chachito son : \n Velocidad : 150pt \n Ataque : 100pt \n Defensa : 150pt \n Vida : 90pt");

        System.out.println("Introduce next para ver el siguiente personaje");
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

        System.out.println("Las estadiscticas de Dragon son : \n Velocidad : 50pt \n Ataque : 150pt \n Defensa : 150pt \n Vida : 100pt \n ");

        System.out.println("Introduce next para elegir un personaje");
        next = shi.next().charAt(0);

        System.out.println("Para elejir como jugador 1 a : \n Harley Quinn, pulse 1 \n Zombie, pulse 2 \n Chachito, pulse 3 \n Dragon, pulse 4");
        int Jugador1 = shi.nextInt();
        System.out.println("Para elejir como jugador 2 a : \n Harley Quinn, pulse 1 \n Zombie, pulse 2 \n Chachito, pulse 3 \n Dragon, pulse 4");
        int Jugador2 = shi.nextInt();

        if (Jugador1 == 1) {
            System.out.println("Jugador 1 ha elegido a Harley Quinn");
            AttakPlayer1 = 100;
            DefensePlayer1 = 90;
            SpeedPlayer1 = 100;
            HealthPlayer1 = 150;
            ReHealthPlayer1 = 150;
        }
        if (Jugador2 == 1) {
            System.out.println("Jugador 2 ha elegido a Harley Quinn");
            AttakPlayer2 = 100;
            DefensePlayer2 = 90;
            SpeedPlayer2 = 100;
            HealthPlayer2 = 150;
            ReHealthPlayer2 = 150;
        }
        if (Jugador1 == 2) {
            System.out.println("Jugador 1 ha elegido a Zombie");
            AttakPlayer1 = 150;
            DefensePlayer1 = 100;
            SpeedPlayer1 = 80;
            HealthPlayer1 = 150;
            ReHealthPlayer1 = 150;
        }
        if (Jugador2 == 2) {
            System.out.println("Jugador 2 ha elegido a Zombie");
            AttakPlayer2 = 150;
            DefensePlayer2 = 100;
            SpeedPlayer2 = 80;
            HealthPlayer2 = 150;
            ReHealthPlayer2 = 150;
        }
        if (Jugador1 == 3) {
            System.out.println("Jugador 1 ha elegido a Chachito");
            AttakPlayer1 = 100;
            DefensePlayer1 = 150;
            SpeedPlayer1 = 150;
            HealthPlayer1 = 120;
            ReHealthPlayer1 = 120;
        }
        if (Jugador2 == 3) {
            System.out.println("Jugador 2 ha elegido a Chachito");
            AttakPlayer2 = 100;
            DefensePlayer2 = 150;
            SpeedPlayer2 = 150;
            HealthPlayer2 = 120;
            ReHealthPlayer2 = 150;
        }
        if (Jugador1 == 4) {
            System.out.println("Jugador 1 ha elegido a Dragon");
            AttakPlayer1 = 150;
            DefensePlayer1 = 150;
            SpeedPlayer1 = 50;
            HealthPlayer1 = 100;
            ReHealthPlayer1 = 100;
        }
        if (Jugador2 == 4) {
            System.out.println("Jugador 2 ha elegido a Dragon");
            AttakPlayer2 = 150;
            DefensePlayer2 = 150;
            SpeedPlayer2 = 50;
            HealthPlayer2 = 100;
            ReHealthPlayer2 = 100;
        }

        System.out.println("Va a comenzar el combate, estan preparados?.... Introduzca next por consola");
        next = shi.next().charAt(0);

        Random random = new Random();
        int damage1 = random.nextInt(AttakPlayer1);
        int damage2 = random.nextInt(AttakPlayer2);

        if (SpeedPlayer1 > SpeedPlayer2) {
            System.out.println("El Jugador 1 ha sido mas rapido que el Jugador 2, por lo que este atacara primero   //Escribe n para continuar//");
            next = shi.next().charAt(0);
            if (AttakPlayer1 > DefensePlayer2) {
                System.out.println("El Jugador 1 encontro el punto debil del Jugador 2!!");
                next = shi.next().charAt(0);
                HealthPlayer2 = HealthPlayer2 - damage1;
                System.out.println("El Jugador 2 ha sufrido una perdida de " + damage1 + " puntos de daño");
                System.out.println("Al jugador 2 le quedan " + HealthPlayer2 + " puntos de vida OUCH     //Escribe n para continuar//");
                next = shi.next().charAt(0);
            } else if (damage1 == DefensePlayer2 || damage1 < DefensePlayer2) {
                System.out.println("El Jugador 2 se ha defendido y no ha sufrido ningun daño!! ");
            }

        } else if (SpeedPlayer2 > SpeedPlayer1) {
            System.out.println("El Jugador 2 ha sido mas rapido que el Jugador 1, por lo que este atacara primero   //Escribe n para continuar// ");
            next = shi.next().charAt(0);
            if (AttakPlayer2 > DefensePlayer1) {
                System.out.println("El Jugador 2 encontro el punto debil del Jugador 1!!    //Escribe n para continuar//");
                next = shi.next().charAt(0);
                HealthPlayer1 = HealthPlayer1 - damage2;
                System.out.println("El Jugador 2 ataqua al Jugador 1 con " + damage2 + " puntos de daño");
                System.out.println("Al jugador 1 le quedan " + HealthPlayer1 + " puntos de vida OUCH     //Escribe n para continuar//");
                next = shi.next().charAt(0);
            } else if (damage2 == DefensePlayer1 || damage2 < DefensePlayer1) {
                System.out.println("El Jugador 1 se ha defendido y no ha sufrido ningun daño!! ");
            }

        } else if (SpeedPlayer1 == SpeedPlayer2) {
            System.out.println("Ambos jugadores son igual de rapidos, por lo que ambos jugadores corren hacia el otro queriendo atacar al mismo tiempo!!   //Escribe n para continuar//");
            next = shi.next().charAt(0);
            if (AttakPlayer1 > AttakPlayer2) {
                System.out.println("El jugador 1 es mas fuerte!!");
                System.out.println("Jugador 1 ataca al Jugador 2");
                if (AttakPlayer1 > DefensePlayer2) {
                    System.out.println("El Jugador 1 encontro el punto debil del Jugador 2 ");
                    next = shi.next().charAt(0);
                    HealthPlayer2 = HealthPlayer2 - damage1;
                    System.out.println("El Jugador 2 ha sufrido una perdida de " + damage1 + " puntos de daño");
                    System.out.println("Al jugador 2 le quedan " + HealthPlayer2 + " puntos de vida OUCH     //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                } else if (damage1 == DefensePlayer2 || AttakPlayer1 < DefensePlayer2) {
                    System.out.println("El Jugador 2 se ha defendido y no ha sufrido ningun daño!! ");
                }
            } else if (AttakPlayer2 > AttakPlayer1) {
                System.out.println("El Jugador 2 ha sido mas rapido que el Jugador 1, por lo que este atacara primero   //Escribe n para continuar// ");
                next = shi.next().charAt(0);
                if (AttakPlayer1 > DefensePlayer2) {
                    System.out.println("El Jugador 2 encontro el punto debil del Jugador 1!!    //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    HealthPlayer1 = HealthPlayer1 - damage2;
                    System.out.println("El Jugador 1 ha sufrido una perdida de " + damage2 + " puntos de daño");
                    System.out.println("Al jugador 1 le quedan " + HealthPlayer1 + " puntos de vida OUCH     //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                } else if (damage2 == DefensePlayer1 || damage2 < DefensePlayer1) {
                    System.out.println("El Jugador 1 se ha defendido y no ha sufrido ningun daño!! ");
                }
            }
        }

        System.out.println("Se ha realizado la primera ronda");
        System.out.println("Al Jugador 1 le quedan " + HealthPlayer1 + " puntos de vida ");
        System.out.println("Al Jugador 2 le quedan " + HealthPlayer2 + " puntos de vida");
        System.out.println(" // Introduce n para continuar // ");

        next = shi.next().charAt(0);

        while (HealthPlayer2 > 0 && HealthPlayer1 > 0) {

            int atacar = random.nextInt(10);

            int HealPlayer1 = random.nextInt(50);
            int HealPlayer2 = random.nextInt(50);
            int HitPlayer1 = random.nextInt(AttakPlayer1);
            int HitPlayer2 = random.nextInt(AttakPlayer2);

            int DecisionRound = 0;

            System.out.println("Es el turno del Jugador 1, puede decidir si atacar o curarse, que hace?");
            System.out.println("\n 1 atacar \n 2 regenerarse");
            DecisionRound = shi.nextInt();

            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                if (DecisionRound == 1) {
                    System.out.println("El jugador 1 se prepara para atacar!!              //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    HealthPlayer2 = HealthPlayer2 - HitPlayer1;

                    if (HealthPlayer2 < 0) {
                        HealthPlayer2 = 0;
                    }

                    System.out.println("El jugador 1 ha atacado al Jugador 2 con " + HitPlayer1 + " puntos de daño");
                    System.out.println("Al jugador 2 le quedan " + HealthPlayer2 + " puntos de vida             //Introduce n para continuar//");
                    next = shi.next().charAt(0);

                } else if (DecisionRound == 2) {
                    HealthPlayer1 = HealthPlayer1 + HealPlayer1;

                    if (HealthPlayer1 > ReHealthPlayer1) {
                        HealthPlayer1 = ReHealthPlayer1;
                    }

                    System.out.println("El jugador 1 va en busca de una pocion         //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println("El jugador 1 ha encontrado una pocion de " + HealPlayer1 + " puntos de vida, por lo que su salud aumenta a " + HealthPlayer1 + "           //Introduce n para continuar// ");
                    next = shi.next().charAt(0);
                }
            }

            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                System.out.println("Es el turno de el Jugador 2, puede decidir si atacar o curarse, que hace?");
                System.out.println("\n 1 Atacar \n 2 Curarse");
                DecisionRound = shi.nextInt();

                if (DecisionRound == 1) {
                    System.out.println("El jugador 2 se prepara para atacar!!              //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    HealthPlayer1 = HealthPlayer1 - HitPlayer2;

                    if (HealthPlayer1 < 0) {
                        HealthPlayer1 = 0;
                    }

                    System.out.println("El jugador 2 ha atacado a el Jugador 1 con " + HitPlayer2 + " puntos de daño");
                    System.out.println("Al jugador 1 le quedan " + HealthPlayer1 + " puntos de vida                 //Introduce n para continuar//");
                    next = shi.next().charAt(0);

                } else if (DecisionRound == 2) {
                    HealthPlayer2 = HealthPlayer2 + HealPlayer2;

                    if (HealthPlayer2 > ReHealthPlayer2) {
                        HealthPlayer2 = ReHealthPlayer2;
                    }
                    System.out.println("El jugador 2 va en busca de una pocion         //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println("El jugador 2 ha encontrado una pocion de " + HealPlayer2 + " puntos de vida, por lo que su salud aumenta a " + HealthPlayer2 + "          //Introduce n para continuar//");
                    next = shi.next().charAt(0);
                }
            }

            if (HealthPlayer1 > 0 && HealthPlayer2 > 0) {
                System.out.println("Se han realizado " + Round + " rondas");

                System.out.println("Vida JUGADOR 1");
                for (int i = 1; i <= HealthPlayer1; i++) {
                    System.out.print("❤\uFE0F");
                }
                System.out.println(" // Introduce n para continuar // ");
                next = shi.next().charAt(0);
                System.out.println("Vida JUGADOR 2");
                for (int i = 1; i <= HealthPlayer2; i++) {
                    System.out.print("❤\uFE0F");
                }
                System.out.println(" // Introduce n para continuar // ");
                next = shi.next().charAt(0);
            }

            if (HealthPlayer2 <= 0 || HealthPlayer1 <= 0 || Round > 10) {
                if (HealthPlayer2 <= 0) {
                    System.out.println("El jugador 2 ve su vida reducida a 0         // Introduce n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println(" .....                // Introduce n para continuar// ");
                    next = shi.next().charAt(0);
                    showAsciiArtWinner();
                    System.out.println("EL JUGADOR 1 GANA LA PARTIDA");
                    break;

                } else if (HealthPlayer1 <= 0) {
                    System.out.println("El jugador 1 ve su vida reducida a 0         // Introduce n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println(" ...                // Introduce n para continuar// ");
                    next = shi.next().charAt(0);
                    showAsciiArtWinner();
                    System.out.println("EL JUGADOR 2 GANA LA PARTIDA");
                    break;

                } else if (Round == 10) {
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
                    break;
                }
            }
            Round++;
        }
    }
}

