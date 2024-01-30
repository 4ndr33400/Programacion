import java.util.Scanner;
public class CuentaPersonaPruebas {
    static int option;
    static String id;
    static int bankAccount;
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Elige una de las siguientes opciones: " +
                "\n1. Instanciar objetos de tipo Persona." +
                "\n2. Instanciar objetos de tipo Cuenta y asociado a una persona" +
                "\n3. Mostrar datos de una persona." +
                "\n4. Recibir la nomina mensual de una persona." +
                "\n5. Recibir un pago." +
                "\n6. Realizar transferencia entre cuentas." +
                "\n7.Imprimir personas morosas");
        System.out.print("Introduce la opcion: ");
        option = in.nextInt();
        PersonaCuentas persona = new PersonaCuentas(id);
        Cuentas cuenta = new Cuentas(bankAccount);
        switch (option){
            default: System.out.println("Esa opcion no esta en la lista neno ._.");
            case 1:
                System.out.print("Introduce tu DNI: ");
                id = in.nextLine();
            case 2:
                System.out.print("Introduce tu numero de cuenta bancaria: ");
                bankAccount = in.nextInt();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                persona.isDefaulter();
        }
    }
}
