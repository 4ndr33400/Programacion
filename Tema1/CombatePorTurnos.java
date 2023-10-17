import java.util.Random;
import java.util.Scanner;
public class CombatePorTurnos {
    public static void main (String [] args){
        Scanner shi = new Scanner (System.in);




        int rondas = 2;
///////////////////////////////
        int Atq1 = 0;
        int Def1 = 0;
        int Vel1 = 0;
        int Vida1= 0;
        int Salud1 = 0;
///////////////////////////////
        int Atq2 = 0;
        int Def2 = 0;
        int Vel2 = 0;
        int Vida2= 0;
        int Salud2 =0;


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
        System.out.println (
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




        System.out.println ("Las estadisticas del Zombie son : \n Velocidad : 80pt \n Ataque : 50pt \n Defensa : 100pt \n Vida : 150pt \n ");

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
        System.out.println ("Las estadiscticas de Dragon son : \n Velocidad : 50pt \n Ataque : 150pt \n Defensa : 150pt \n Vida : 100pt \n ");


        System.out.println("Introduce next para elegir un personaje");
        next = shi.next().charAt(0);


        System.out.println("Para elejir como jugador 1 a : \n Harley Quinn, pulse 1 \n Zombie, pulse 2 \n Chachito, pulse 3 \n Dragon, pulse 4");
        int Jugador1 = shi.nextInt();
        System.out.println("Para elejir como jugador 2 a : \n Harley Quinn, pulse 1 \n Zombie, pulse 2 \n Chachito, pulse 3 \n Dragon, pulse 4");
        int Jugador2 = shi.nextInt();

        // SI SE ELIJE A HARLEY QUINN //
        if (Jugador1 == 1){
            System.out.println ("Jugador 1 ha elegido a Harley Quinn");
            Atq1 = 100;
            Def1 = 90;
            Vel1 = 100;
            Vida1= 150;
            Salud1 =150;
        }
        if (Jugador2 == 1) {
            System.out.println ("Jugador 2 ha elegido a Harley Quinn");
            Atq2 = 100;
            Def2 = 90;
            Vel2 = 100;
            Vida2= 150;
            Salud2= 150;
        }
        // SI SE ELIJE A HARLEY QUINN //

        // SI SE ELIJE AL ZOMBIE //
        if (Jugador1 == 2){
            System.out.println ("Jugador 1 ha elegido a Zombie");
            Atq1 = 150;
            Def1 = 100;
            Vel1 = 80;
            Vida1= 150;
            Salud1 =150;
        }
        if (Jugador2 == 2){
            System.out.println ("Jugador 2 ha elegido a Zombie");
            Atq2 = 150;
            Def2 = 100;
            Vel2 = 80;
            Vida2= 150;
            Salud2 =150;
        }
        // SI SE ELIJE AL ZOMBIE //

        // SI SE ELIJE A CHACHITO //
        if (Jugador1 == 3){
            System.out.println ("Jugador 1 ha elegido a Chachito");
            Atq1 = 100;
            Def1 = 150;
            Vel1 = 150;
            Vida1= 120;
            Salud1 =120;
        }
        if (Jugador2 == 3){
            System.out.println ("Jugador 2 ha elegido a Chachito");
            Atq2 = 100;
            Def2 = 150;
            Vel2 = 150;
            Vida2= 120;
            Salud2 =150;
        }
        // SI SE ELIJE A CHACHITO //

        // SI SE ELIJE AL DRAGON //
        if (Jugador1 == 4){
            System.out.println ("Jugador 1 ha elegido a Dragon");
            Atq1 = 150;
            Def1 = 150;
            Vel1 = 50;
            Vida1= 100;
            Salud1 =100;
        }
        if (Jugador2 == 4){
            System.out.println("Jugador 2 ha elegido a Dragon");
            Atq2 = 150;
            Def2 = 150;
            Vel2 = 50;
            Vida2= 100;
            Salud2 =100;
        }
        // SI SE ELIJE AL DRAGON //


        System.out.println("Va a comenzar el combate, estan preparados?.... Introduzca next por consola");
        next = shi.next().charAt(0);


        Random random = new Random ();
        int damage1 = random.nextInt(Atq1);
        int damage2  = random.nextInt(Atq2);


        if (Vel1 > Vel2){
            System.out.println("El Jugador 1 ha sido mas rapido que el Jugador 2, por lo que este atacara primero   //Escribe n para continuar//");
            next = shi.next().charAt(0);
            if (Atq1 > Def2){
                System.out.println("El Jugador 1 encontro el punto debil del Jugador 2!!");
                next = shi.next().charAt(0);
                Vida2 = Vida2 - damage1 ;
                System.out.println("El Jugador 2 ha sufrido una perdida de " + damage1  + " puntos de daño");
                System.out.println("Al jugador 2 le quedan " +  Vida2 + " puntos de vida OUCH     //Escribe n para continuar//");
                next = shi.next().charAt(0);
            } else if (damage1  == Def2 || damage1  < Def2){
                System.out.println ("El Jugador 2 se ha defendido y no ha sufrido ningun daño!! ");
            }


        } else if (Vel2 > Vel1){
            System.out.println("El Jugador 2 ha sido mas rapido que el Jugador 1, por lo que este atacara primero   //Escribe n para continuar// ");
            next = shi.next().charAt(0);
            if (Atq1 > Def2){
                System.out.println("El Jugador 2 encontro el punto debil del Jugador 1!!    //Escribe n para continuar//");
                next = shi.next().charAt(0);
                Vida1 = Vida1 - damage2;
                System.out.println("El Jugador 2 ataqua al Jugador 1 con " + damage2 + " puntos de daño");
                System.out.println("Al jugador 1 le quedan " +  Vida1  + " puntos de vida OUCH     //Escribe n para continuar//");
                next = shi.next().charAt(0);
            } else if (damage2 == Def1 || damage2 < Def1){
                System.out.println ("El Jugador 1 se ha defendido y no ha sufrido ningun daño!! ");
            }


        } else if (Vel1 == Vel2) {
            System.out.println ("Ambos jugadores son igual de rapidos, por lo que ambos jugadores corren hacia el otro queriendo atacar al mismo tiempo!!   //Escribe n para continuar//" );
            next = shi.next().charAt(0);
            if (Atq1 > Atq2){
                System.out.println ("El jugador 1 es mas fuerte!!");
                System.out.println ("Jugador 1 ataca al Jugador 2");
                if (Atq1 > Def2){
                    System.out.println("El Jugador 1 encontro el punto debil del Jugador 2 ");
                    next = shi.next().charAt(0);
                    Vida2 = Vida2 - damage1 ;
                    System.out.println("El Jugador 2 ha sufrido una perdida de " + damage1  + " puntos de daño");
                    System.out.println("Al jugador 2 le quedan " +  Vida2  + " puntos de vida OUCH     //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                } else if (damage1  == Def2 || Atq1 < Def2){
                    System.out.println ("El Jugador 2 se ha defendido y no ha sufrido ningun daño!! ");
                }
            } else if (Atq2 > Atq1){
                System.out.println("El Jugador 2 ha sido mas rapido que el Jugador 1, por lo que este atacara primero   //Escribe n para continuar// ");
                next = shi.next().charAt(0);
                if (Atq1 > Def2) {
                    System.out.println("El Jugador 2 encontro el punto debil del Jugador 1!!    //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    Vida1 = Vida1-damage2;
                    System.out.println("El Jugador 1 ha sufrido una perdida de " + damage2 + " puntos de daño");
                    System.out.println("Al jugador 1 le quedan " + Vida1  + " puntos de vida OUCH     //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                }   else if (damage2 == Def1 || damage2 < Def1){
                    System.out.println ("El Jugador 1 se ha defendido y no ha sufrido ningun daño!! ");
                }
            }
        }

        System.out.println("Se ha realizado la primera ronda");
        System.out.println("Al Jugador 1 le quedan " + Vida1 + " puntos de vida ");
        System.out.println("Al Jugador 2 le quedan " + Vida2  + " puntos de vida");
        System.out.println(" // Introduce n para continuar // ");

        next = shi.next().charAt(0);

        while ( Vida2 > 0 && Vida1 > 0){


            int atacar = random.nextInt(10);

            int curarse1 = random.nextInt(50);
            int curarse2 = random.nextInt(50);
            int hit1 = random.nextInt(Atq1);
            int hit2 = random.nextInt(Atq2);

            int decision = 0;


            ////////////////////////////////////////////////////////////////
            /////////////////////ATACA JUGADOR 1////////////////////////////
            ////////////////////////////////////////////////////////////////


            System.out.println ("Es el turno del Jugador 1, puede decidir si atacar o curarse, que hace?" );
            System.out.println ("\n 1 atacar \n 2 regenerarse");
            decision = shi.nextInt();


            if (Vida1 > 0 && Vida2 > 0) {
                if (decision == 1) {
                    System.out.println("El jugador 1 se prepara para atacar!!              //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    Vida2 = Vida2 - hit1;


                    if (Vida2 < 0) {
                        Vida2 = 0;
                    }


                    System.out.println("El jugador 1 ha atacado al Jugador 2 con " + hit1 + " puntos de daño");
                    System.out.println("Al jugador 2 le quedan " + Vida2 + " puntos de vida             //Introduce n para continuar//");
                    next = shi.next().charAt(0);




                } else if (decision == 2) {
                    Vida1 = Vida1 + curarse1;


                    if (Vida1 > Salud1) {
                        Vida1 = Salud1;
                    }


                    System.out.println("El jugador 1 va en busca de una pocion         //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println("El jugador 1 ha encontrado una pocion de " + curarse1 + " puntos de vida, por lo que su salud aumenta a " + Vida1 + "           //Introduce n para continuar// ");
                    next = shi.next().charAt(0);
                }
            }


            ////////////////////////////////////////////////////////////////
            /////////////////////ATACA JUGADOR 2////////////////////////////
            ////////////////////////////////////////////////////////////////


            if (Vida1 > 0 && Vida2 > 0) {
                System.out.println("Es el turno de el Jugador 2, puede decidir si atacar o curarse, que hace?");
                System.out.println("\n 1 Atacar \n 2 Curarse");
                decision = shi.nextInt();




                if (decision == 1) {
                    System.out.println("El jugador 2 se prepara para atacar!!              //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    Vida1 = Vida1 - hit2;


                    if (Vida1 < 0) {
                        Vida1 = 0;
                    }


                    System.out.println("El jugador 2 ha atacado a el Jugador 1 con " + hit2 + " puntos de daño");
                    System.out.println("Al jugador 1 le quedan " + Vida1 + " puntos de vida                 //Introduce n para continuar//");
                    next = shi.next().charAt(0);




                } else if (decision == 2) {
                    Vida2 = Vida2 + curarse2;


                    if (Vida2 > Salud2) {
                        Vida2 = Salud2;
                    }
                    System.out.println("El jugador 2 va en busca de una pocion         //Escribe n para continuar//");
                    next = shi.next().charAt(0);
                    System.out.println("El jugador 2 ha encontrado una pocion de " + curarse2 + " puntos de vida, por lo que su salud aumenta a " + Vida2 + "          //Introduce n para continuar//");
                    next = shi.next().charAt(0);
                }
            }


            if (Vida1 > 0 && Vida2 > 0) {
                System.out.println("Se han realizado " + rondas + " rondas");

                System.out.println("Vida JUGADOR 1");
                for (int i = 1; i <= Vida1; i++) {
                    System.out.print("-");
                }
                System.out.println(" // Introduce n para continuar // ");
                next = shi.next().charAt(0);
                System.out.println("Vida JUGADOR 2");
                for (int i = 1; i <= Vida2; i++) {
                    System.out.print("-");
                }
                System.out.println(" // Introduce n para continuar // ");
                next = shi.next().charAt(0);

            }

                if (Vida2 <= 0 || Vida1 <= 0 || rondas > 10){
                    if (Vida2 <= 0) {
                        System.out.println ("El jugador 2 ve su vida reducida a 0.....          // Introduce n para continuar//");
                        next = shi.next().charAt(0);
                        System.out.println(" ...                // Introduce n para continuar// ");
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


                        System.out.println("EL JUGADOR 1 GANA LA PARTIDA");
                        break;

                    } else if (Vida1 <= 0 ) {
                        System.out.println ("El jugador 1 ve su vida reducida a 0.....          // Introduce n para continuar//");
                        next = shi.next().charAt(0);
                        System.out.println(" ...                // Introduce n para continuar// ");
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
                        System.out.println("EL JUGADOR 2 GANA LA PARTIDA");
                        break;

                    } else if (rondas == 10){
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
                rondas ++;
            }
        }
    }
























