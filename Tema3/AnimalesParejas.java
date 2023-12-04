import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class AnimalesParejas {
    static Random random = new Random();
    public static String [] CreateAnimalesArray(){
        int contadorPosicion;
        int contadorAnimal =0;
        int Posicion = 0;
        String[] ArrayPosiciones;
        ArrayPosiciones = new String []{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};
        String [] ArrayAnimales;
        ArrayAnimales = new String[]{"Alpaca","Chachito","Perro","Manatee","Tiburon","Larva","Perro","Rata","Iguanodon(Peticion de Mr.Gargallo)","Libelula"};

        do {
            contadorPosicion = 0;
            do{
                Posicion = random.nextInt(0,20);
                if(ArrayPosiciones[Posicion].equals("0")){
                    ArrayPosiciones[Posicion] = ArrayAnimales[contadorAnimal];
                    contadorPosicion++;
                }
            } while (contadorPosicion < 2);
            contadorAnimal++;
        } while(contadorAnimal <=9);
        return ArrayPosiciones;
    }
    public static boolean(){}

    public static void main(String []args){
        String [] ArrayParejas = CreateAnimalesArray().clone();


    }
}