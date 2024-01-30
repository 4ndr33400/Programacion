public class PersonaPOO {
    public int age;
    public String name;
    public String username;
    public final String id;

    public static final int DEFAULT_ISADULT_AGE = 18;
    public static final int DEFAULT_ISRETIRED_AGE = 65;


    public PersonaPOO(int age, String name, String username, String id) {

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

    public String getId() {
        return id;
    }

    public void setPersona(int age, String name, String username) {

        this.name = name;
        this.username = username;

        if (age > 0) {
            this.age = age;
        }
    }

    public void printPersona(int age, String name, String username, String id) {

        System.out.println("Nombre: " + name +
                "\nApellido: " + username +
                "\nEdad: " + age +
                "\nDNI: " + id);
    }

    public boolean isAdult(int age) {
        boolean isAdult = false;

        if (age >= DEFAULT_ISADULT_AGE) {
            isAdult = true;
        }
        return isAdult;
    }

    public boolean isRetired(int age) {
        boolean isRetired = false;

        if (age >= DEFAULT_ISRETIRED_AGE) {
            isRetired = true;
        }
        return isRetired;
    }

    public int ageDifference(Persona persona) {
        int ageDifference = this.age - persona.age;

        return Math.abs(ageDifference);
    }

    public boolean checkID(String id) {

        boolean isIdValid = true;
        char[] validLetterID = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (id.length() != 9) {
            isIdValid = false;
        } else {

            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(id.charAt(i))) {
                    isIdValid = false;
                    break;
                }
            }
            char lastChar = Character.toUpperCase(id.charAt(8));
            boolean isValidLetter = false;
            for (char validLetter : validLetterID) {
                if (lastChar == validLetter) {
                    isValidLetter = true;
                    break;
                }
            }
            if (!isValidLetter) {
                isIdValid = false;
            }
        }
        return isIdValid;
    }
}
