public class PersonaPOO {
    public int age;
    public String name;
    public String username;
    public String id;

    public static final int DEFAULT_AGE = 0;
    public static final String DEFAULT_NAME = "---";
    public static final String DEFAULT_USERNAME = "---";
    public static final String DEFAULT_ID = "---";
    public static final int DEFAULT_ISADULT_AGE = 18;
    public static final int DEFAULT_ISRETIRED_AGE = 65;


    public PersonaPOO (int age, String name, String username, String id){

        this.age = age;
        this.name = name;
        this.username = username;
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String id (){
        return id;
    }

    public void setPersona(int age, String name, String username) {

        this.name = name;
        this.username = username;

        if (age>0){
            this.age = age;
        }
    }

    public void printPersona(int age, String name, String username, String id){

        System.out.println("Nombre: " + name +
                "\nApellido: " + username +
                "\nEdad: " + age +
                "\nDNI: " + id);
    }
    public boolean isAdult(int age){
        boolean isAdult = false;

        if(age >= DEFAULT_ISADULT_AGE){
            isAdult = true;
        }
        return isAdult;
    }
    public boolean isRetired(int age){
        boolean isRetired = false;

        if(age >= DEFAULT_ISRETIRED_AGE){
            isRetired = true;
        }
        return isRetired;
    }
    public int ageDifference(int ageUser1, int ageUser2){

        int ageDifference = ageUser1 - ageUser2;

        return  ageDifference;
    }

    public boolean checkID (String id){

        char[] validLetterID = new char[0];

        for (int i = 0; i < id.length(); i++){
            if (i > 9 || ){

            }
        }
    }
}
