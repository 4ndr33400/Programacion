import java .util.Scanner;
public class Tema1Ejercicio25 {
   static public void main(String [] args){
       Scanner in = new Scanner (System.in);




       float resultado = 1;
       int cont = 0;
       int imput =0;
       System.out.println("Introduce a number");


       imput = in.nextInt();
       cont=imput;
               while (cont != 0){
                   resultado = resultado*cont;
                   cont--;
               }
               System.out.println("El factorial de "+ imput + " es " + resultado);
   }
}
