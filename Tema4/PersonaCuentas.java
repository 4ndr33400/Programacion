public class PersonaCuentas {
    public final String id;
    public Cuentas[] bankAccount;
    public int numberAccounts;



    public PersonaCuentas(String id) {
        bankAccount = new Cuentas[3];
        this.id = id;
        this.numberAccounts = 0;
    }

    public String getId() {
        return id;
    }

    public Cuentas[] getBankAccount() {
        return bankAccount;
    }
    public void addAccount(Cuentas newAccount){
        if(numberAccounts < 3){
            bankAccount[numberAccounts++] = newAccount;
            numberAccounts++;
        } else {
            System.out.println("Ya tienes 3 cuentas");
        }
    }
    public boolean isDefaulter(){
        boolean isDefaulter = false;
        for (int x = 0; x < bankAccount.length; x++){
            if (bankAccount[x].getCurrentBalance() < 0){
                isDefaulter = true;
            }
        }
        return isDefaulter;
    }
}
