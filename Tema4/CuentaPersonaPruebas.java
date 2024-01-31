import java.util.Scanner;
public class CuentaPersonaPruebas {
    static int option;
    static String id;
    static int bankAccount;
    static int currentBalance;
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
        in.nextLine();

        PersonaCuentas persona1 = new PersonaCuentas(id);
        Cuentas cuenta1 = new Cuentas(bankAccount,currentBalance);
        PersonaCuentas persona2 = new PersonaCuentas("12345678W");
        Cuentas cuenta2 = new Cuentas(12345678,4000);

        switch (option){
            default: System.out.println("Esa opcion no esta en la lista neno ._.");
            case 1:
                System.out.print("Introduce el DNI: ");
                id = in.nextLine();
                break;
            case 2:
                System.out.print("Introduce tu numero de cuenta bancaria: ");
                bankAccount = in.nextInt();
                System.out.print("Cuanto dinero tienes en tu cuenta bancaria?: ");
                currentBalance = in.nextInt();
                persona1.addAccount(cuenta1);
                persona2.addAccount(cuenta2);
                System.out.println("cuenta2: " + cuenta2.getAccountNumber());
                break;
            case 3:
                System.out.print("Introduce tu DNI: ");
                id = in.nextLine();
                System.out.println("Tienes las siguientes cuentas bancarias: ");
                for (int i = 0; i < persona1.getBankAccount().length; i++){
                    Cuentas cuenta = persona1.getBankAccount()[i];
                    System.out.println("Numero de cuenta: " + cuenta.getAccountNumber());
                    System.out.println("Saldo actual: " + cuenta.getCurrentBalance());
                }
                break;
            case 4:
                System.out.print("Cual es tu nomina mensual?: ");
                double recieveCredit = in.nextDouble();
                cuenta1.receiveCredit(recieveCredit);
                System.out.println("Tienes: " + cuenta1.getCurrentBalance() + " dinero en la cuenta");
                break;
                case 5:
                System.out.println("Persona con DNI " + persona2.getId() + " va a recibir un pago de 500€ de " + persona1.getId());
                cuenta1.payBill(500);
                cuenta2.receiveCredit(500);
                break;
            case 6:
                System.out.println("Quien va a realizar la transferencia?: ");
                System.out.println("1. Cuenta con DNI " + persona1.getId() +
                                   "\n2. Cuenta con DNI " + persona2.getId());
                System.out.print("Introduce la seleccion: ");
                option = in.nextInt();
                if(option == 1){
                    System.out.print("Cantidad a transferir: ");
                    double amountCredit = in.nextDouble();
                    cuenta1.payBill(amountCredit);
                    cuenta2.receiveCredit(amountCredit);
                } else if (option == 2){
                    System.out.println("Cantidad a transferir: ");
                    double amountCredit = in.nextDouble();
                    cuenta2.payBill(amountCredit);
                    cuenta1.receiveCredit(amountCredit);
                }
                break;
            case 7:
                persona1.isDefaulter();
                break;
        }
    }
}
