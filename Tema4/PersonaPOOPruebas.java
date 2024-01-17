import java.util.Scanner;

public class PersonaPOOPruebas {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Cual es tu nombre? : ");
        String name = in.nextLine();
        System.out.print("Cuales son tus apellidos? : ");
        String surname = in.nextLine();
        System.out.print("Cual es tu numero de DNI? : ");
        String id = in.nextLine();
        System.out.print("Cual es tu edad? : ");
        int age = in.nextInt();

        PersonaPOO Persona1 = new PersonaPOO(age,name,surname,id);

        System.out.print("Cual es tu nombre? : ");
        String name1 = in.nextLine();
        System.out.print("Cuales son tus apellidos? : ");
        String surname1 = in.nextLine();
        System.out.print("Cual es tu edad? : ");
        int age1 = in.nextInt();
        System.out.print("Cual es tu numero de DNI? : ");
        String id1 = in.nextLine();

        PersonaPOO Persona2 = new PersonaPOO(age1,name1,surname1,id1);

        System.out.println("Los datos de la Persona 1 son :");
        Persona1.printPersona(age,name,surname,id);
        System.out.println("Los datos de la Persona 2 son :");
        Persona2.printPersona(age1,name1,surname1,id1);


        if (Persona1.isAdult(age)){
            System.out.println(Persona1.getName() + " es mayor de edad");
        } else {
            System.out.println(Persona1.getName() + " no es mayor de edad");
        }

        if(Persona2.isAdult(age1)){
            System.out.println(Persona2.getName() + " es mayor de edad");
        } else {
            System.out.println(Persona2.getName() + " no es mayor de edad");
        }

        if (Persona1.isRetired(age)){
            System.out.println(Persona1.getName() + " esta retirad@");
        } else {
            System.out.println(Persona1.getName() + " no esta retirad@");
        }

        if (Persona2.isRetired(age1)){
            System.out.println(Persona2.getName() + " esta retirad@");
        } else {
            System.out.println(Persona2.getName() + " no esta retirad@");
        }

        System.out.println("La diferencia de edad entre " + Persona1.getName() + " y " + Persona2.getName() + " es de: " + Persona1.ageDifference(Persona1.getAge(),Persona2.getAge()) );
    }
}
