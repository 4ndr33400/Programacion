import java.util.Scanner;

import java.util.Random;

public class SearchMine {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static int[] creaArray() {
        int[] result;
        int fin=0;
        int num;
        
        int colocada = 0;
        
        result = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        
        
       

        do{
            colocada=0;
            do{
                num= random.nextInt(0,20); 
                if(result[num]==0){
                    result[num]= 5;
                    if(num-1>=0 && num+1!=5){
                        result[num-1]= result[num-1]+1;
                    }
                    if(num+1<=19 && num+1!=5){
                        result[num+1]= result[num+1]+1;
                    }
                    colocada++; 
                }
            }while(colocada<1);
            fin++; 
        }while(fin<6);
        
        
        return result;
    }
    

    public static boolean printArrayPairs(int[] array, int selecction1,  String[] array2) {
       
        
        array2[selecction1]=String.valueOf(array[selecction1]);
            
        
        for (int x = 0; x < array.length; x++) {
            if(selecction1==x){
                System.out.print(array[x] + " ");
                
            }else{
                
                System.out.print("x" + " ");
                
            }
            
        }
        return (array[selecction1]!=5);
    }

    public static void printArrayString(String[] array) {
        System.out.println("");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        String[] array2;
        
        
        array2 = new String[]{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"};
        int selecction1;
        int fail=0;
        int correct= 0;
        int [] array1= creaArray().clone();
        
        
        do{
            System.out.println("Elige la posicion");
            selecction1 = in.nextInt();
            
            if(printArrayPairs(array1,selecction1,array2)){
                correct++;
            }else{
                
                fail++;
            }
            printArrayString(array2);

        }while(correct!=5 && fail==0);
        
        if(fail==0){
            System.out.println("Has ganado!");
        }else{
            System.out.println("Has perdido!");
        }
        
    }
}