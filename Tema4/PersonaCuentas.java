public class PersonaCuentas {
    public String name;
    public String surname;
    public String age;
    public final String id;
    public int[] bancAccount;

    public PersonaCuentas(int[] bancAccount, String id, String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.bancAccount = bancAccount;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int[] getBancAccount() {
        return bancAccount;
    }
    public String toString(){
        return "";
    }

}
