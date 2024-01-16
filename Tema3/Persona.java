import java.util.Scanner;
public class Persona {
    public String name;
    static Scanner in = new Scanner(System.in);
    public int age;

    //Poner constantes en default
    public static final int DEFAULT_AGE = 0;
    public static final String DEFAULT_NAME= "Desconocido";
    ///////

    //METODOS

    public void sayHello(){
        System.out.println("¡Hola!");
    }

    public void introduceYourself(){
        System.out.println("Hola soy " + name + " y tengo " + age + " años.");
    }

    public void greetPerson(){
        System.out.println("Hola " + name +" eres un putero :D.");
    }
    ///////

    // GUETTER Y SETTER
    // Para imprimir o saber la edad que tienes
    public int getAge(){
        return age;
    }
    // Modificar la edad
    public void setAge (int age){

        if (age < 0){
            this.age = 0;
        }

        if (age >= 18){
            System.out.println("Soy mayor de edad");
        } else {
            System.out.println("No soy mayor de edad");
        }
    }
    // CONSTRUCTORES
    // Diferentes constructores dependiendo de las necesidades

    // Un constructor en el que sabes el nombre y la edad
    public Persona(String name , int age){
        this.name = name;
        this.age = age;
    }
    //Un constructor en el que solo sabes el nombre pero no la edad
    public Persona (String name){
        this.name = name;
        this.age = DEFAULT_AGE;
    }
    //Un constructor en el que ni sabes el nombre ni la edad
    public Persona (){
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }
    // Para mostrar informacion sobre la clase
    public static void showInfo(){
        System.out.println("Las personas deberian tener nombre y edad");
    }
    // En una clase diferente el main
    public static void main (String[] args){
        // Crear los objetos que se quieran
        Persona Andrea = new Persona("Andrea",18);
        Persona Edgar = new Persona("Edgar");
        Persona baby = new Persona();
        // Llamar a los getter y setter
        System.out.println(Andrea.getAge());
        Edgar.setAge(18);
        // Utilizar los metodos
        System.out.println("ANDREA");
        Andrea.introduceYourself();
        Andrea.greetPerson();

        System.out.println("BEBE");
        baby.introduceYourself();
        baby.greetPerson();

        System.out.println("EDGAR");
        Edgar.introduceYourself();
        Edgar.greetPerson();
    }
}
