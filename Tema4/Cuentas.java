public class Cuentas {

    public int accountNumber;
    public double currentBalance;

    public Cuentas(int accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
    public void receiveCredit(double recievedCredit){
        currentBalance += recievedCredit;
    }
    public void payBill(int amount2Pay){
        currentBalance -= amount2Pay;
    }
}
