public class Cuentas {

    public int accountNumber;
    public int currentBalance;

    public Cuentas(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }
    public void receiveCredit(int recievedCredit){
        currentBalance += recievedCredit;
    }
    public void payBill(int amount2Pay){
        currentBalance -= amount2Pay;
    }
}
