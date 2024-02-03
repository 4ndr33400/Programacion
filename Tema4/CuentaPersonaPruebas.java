import java.util.Scanner;

public class CuentaPersonaPruebas {
    static int option;
    static String id;
    static Cuentas bankAccount;
    static int accountNumber;
    static int currentBalance;
    static int accountAdded;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Elige una de las siguientes opciones: " +
                "\n1. Instanciar objetos de tipo Persona." +
                "\n2. Instanciar objetos de tipo Cuenta y asociado a una persona" +
                "\n3. Mostrar datos de una persona." +
                "\n4. Recibir la nomina mensual de una persona." +
                "\n5. Recibir un pago." +
                "\n6. Realizar transferencia entre cuentas." +
                "\n7. Imprimir personas morosas" +
                "\n8. Salir.");

        PersonaCuentas[] users = new PersonaCuentas[0];

        do {
            System.out.print("Introduce la opcion: ");
            option = in.nextInt();
            in.nextLine();
            accountAdded = 0;
            switch (option) {
                default:
                    System.out.println("Esa opcion no esta en la lista neno ._.");
                    break;
                case 1:
                    System.out.print("Introduce el DNI: ");
                    id = in.nextLine();
                    PersonaCuentas addAccount = new PersonaCuentas(id);
                    PersonaCuentas[] updateUsers = new PersonaCuentas[users.length + 1];
                    System.arraycopy(users, 0, updateUsers, 0, users.length);
                    updateUsers[users.length] = addAccount;
                    users = updateUsers.clone();
                    System.out.println(users.length);
                    break;

                case 2:
                    if(users.length != 0){
                        System.out.print("Introduce tu numero de cuenta bancaria: ");
                        accountNumber = in.nextInt();
                        System.out.print("Cuanto dinero tienes en tu cuenta bancaria?: ");
                        currentBalance = in.nextInt();
                        Cuentas newAccount = new Cuentas(accountNumber, currentBalance);
                        System.out.print("Cual es tu DNI: ");
                        id = in.nextLine();
                        for (int i = 0; i < users.length ; i++){
                            if(id.equals(users[i].getId())){
                                users[i].addAccount(newAccount);
                                System.out.println("Se ha añadido la cuenta");
                                accountNumber++;
                            }
                        }


                    } else {
                        System.out.println("Debes añadir una cuenta antes.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce tu DNI: ");
                    id = in.nextLine();
                    System.out.println("Tienes las siguientes cuentas bancarias: ");
                    for (int i = 0; i < users.length; i++) {
                        if (id.equals(users[i].getId())) {
                            Cuentas[] cuentas = users[i].getBankAccount();
                            for (int j = 0; j < cuentas.length; j++) {
                                Cuentas cuenta = cuentas[j];
                                System.out.println("Numero de cuenta: " + cuenta.getAccountNumber());
                                System.out.println("Saldo actual: " + cuenta.getCurrentBalance());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Cual es tu nomina mensual?: ");
                    double recieveCredit = in.nextDouble();
                    for (int i = 0; i < users.length; i++) {
                        if (id.equals(users[i].getId())) {
                            Cuentas[] cuentas = users[i].getBankAccount();
                            for (int j = 0; j < cuentas.length; j++) {
                                Cuentas cuenta = cuentas[j];
                                cuenta.receiveCredit(recieveCredit);
                                System.out.println("Tienes: " + cuenta.getCurrentBalance() + " dinero en la cuenta");
                            }
                        }
                    }
                    break;
                    /*
                case 5:
                    System.out.println("Persona con DNI " + persona2.getId() + " va a recibir un pago de 500€ de " + persona1.getId());
                    Cuentas.payBill(500);
                    cuenta2.receiveCredit(500);
                    break;
                case 6:
                    System.out.println("Quien va a realizar la transferencia?: ");
                    System.out.println("1. Cuenta con DNI " + persona1.getId() +
                            "\n2. Cuenta con DNI " + persona2.getId());
                    System.out.print("Introduce la seleccion: ");
                    option = in.nextInt();
                    if (option == 1) {
                        System.out.print("Cantidad a transferir: ");
                        double amountCredit = in.nextDouble();
                        cuenta1.payBill(amountCredit);
                        cuenta2.receiveCredit(amountCredit);
                    } else if (option == 2) {
                        System.out.println("Cantidad a transferir: ");
                        double amountCredit = in.nextDouble();
                        cuenta2.payBill(amountCredit);
                        cuenta1.receiveCredit(amountCredit);
                    }
                    break;

                     */


                case 7:
                    System.out.println("Personas morosas:");
                    for (int i = 0; i < users.length; i++) {
                        if (users[i].isDefaulter()) {
                            System.out.println("DNI: " + users[i].getId());
                        }
                    }
                    break;
                case 8:
                    System.out.println("adioh");
                    break;


            }
            if (option == 8) {
                break;
            }
        } while (option != 8);
    }
}
