
import java.util.Scanner;

import java.util.Random;

public class SearchPair {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static String[] creaArray() {
        String[] result;
        int fin=0;
        int num;
        
        int contPair = 0;
        
        result = new String[]{"vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio","vacio"};
        
        String[] parejas;
        
        parejas = new String[]{"Sergio","Jorge","Pablo","Edgar","Marc","David","Isma","Fran","Pedro","Juan"};

        do{
            contPair=0;
            do{
                num= random.nextInt(0,20); 
                if(result[num].equals("vacio")){
                    result[num]= parejas[fin];
                    contPair++; 
                }
            }while(contPair<2);
            fin++; 
        }while(fin<10);
        
        
        return result;
    }
    

    public static boolean printArrayPairs(String[] array, int selecction1, int selecction2, String[] array2) {
        String value;
        if(array[selecction1].equals(array[selecction2])){
            array2[selecction1]=array[selecction1];
            array2[selecction2]=array[selecction2];
        }
        for (int x = 0; x < array.length; x++) {
            if(selecction1==x){
                System.out.print(array[x] + " ");
                
            }else{
                if(selecction2==x){
                    System.out.print(array[x] + " ");
                }else{
                    System.out.print("x" + " ");
                }
            }
            
        }
        return (array[selecction1].equals(array[selecction2]));
    }

    public static void printArrayString(String[] array) {
        System.out.println("");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        
    }

    public static void main(String[] args) throws Exception {
        String[] array2;
        
        
        array2 = new String[]{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"};
        int selecction1;
        int selecction2;
        int correct= 0;
        String [] array1= creaArray().clone();
        
        do{
            System.out.println("Elige la posicion 1");
            selecction1 = in.nextInt();
            System.out.println("Elige la posicion 2");
            selecction2 = in.nextInt();
            if(printArrayPairs(array1,selecction1,selecction2,array2)){
                correct++;
            }
            printArrayString(array2);

        }while(correct!=10);
        
        System.out.println("Has ganado!");



        
    }
}
