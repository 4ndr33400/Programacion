public class Persona {
    Persona persona = new Persona();
    public String name;
    public int age;

    public String sayHello(){
        return "Hola";
    }
    public String introduceYourself(){
        return "Hola soy" + name + " y tengo " + age;
    }
    public void greetPerson(String persona){
        System.out.println("Hola " + name);
    }

    public static void main (String[] args){
        Persona Andrea = new Persona();

        Andrea.name = "Andrea";
        Andrea.age = 19;

        Andrea.sayHello();
        Andrea.introduceYourself();
        Andrea.greetPerson("Edgar");





    }


}
