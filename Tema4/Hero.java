import java.util.Random;

public class Hero {
    static Random random = new Random();
    public String name;
    public int level;
    public int health;
    public int maxHealth;
    public int experience;
    public int attack;
    public int defense;
    public final int potion = 10;
    public final int rest = 50;
    public final int maxAttak = (health / 2);
    public final int gainExpo = 10;

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
    public int getMaxAttak(){
        return maxAttak;
    }

    public int drinkPotion(int health, int maxHealth){
        int healPlayer = health + potion;
        if (healPlayer > maxHealth){
            healPlayer = maxHealth;
        }
        return healPlayer;
    }
    public void rest(){
        int restPlayer = health + rest;
        if (restPlayer > maxHealth){
            restPlayer = maxHealth;
        }
    }
    public String toString(){
        String characterSheet = "//" + name + "//" +
                "\nNivel: " + level +
                "\nVida: " + health +
                "\nExperiencia: " + experience +
                "\nAtaque: " + attack +
                "\nDefensa: " + defense;
        return characterSheet;
    }
    public int attackPlayer1(){
        int hitPlayer1 = random.nextInt(maxAttak);
        hitPlayer1 = hitPlayer1 - health;
        experience += gainExpo;

        return Math.abs(hitPlayer1);
    }
    public int levelUp(){

    }
}
