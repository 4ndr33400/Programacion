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
    public static final int DEFAULT_HEALTH = 300;
    public static final int DEFAULT_ATTACK = 100;
    public static final int DEFAULT_DEFENSE = 100;
    public final int potion = 10;
    public final int rest = 50;
    public final int maxAttak = (health / 2);
    public final int gainExpo = 10;
    public final int expoGainHealth = 5;

    public Hero(String name, int level, int health, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
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


    public void setHealth(int health) {
       if (health > DEFAULT_HEALTH){
           this.health = DEFAULT_HEALTH;
       }
    }

    public void setAttack(int attack) {
        if (attack > DEFAULT_ATTACK){
            this.attack = DEFAULT_ATTACK;
        }
    }

    public void setDefense(int defense) {
       if (defense > DEFAULT_DEFENSE){
           this.defense = DEFAULT_DEFENSE;
       }
    }
    public void setLevel(int level){
        if (level > 0){
            this.level = 0;
        }
    }

    public void drinkPotion(){
        health = health + potion;
        if (health > maxHealth){
            health = maxHealth;
        }

    }
    public void rest(){
        health = health + rest;
        if (health > maxHealth){
            health = maxHealth;
        }
    }
    public void infoCharacters(){
        System.out.println( name +
                "\n\uD83D\uDE3C Nivel: " + level +
                "\n\uD83D\uDE3C Vida: " + health +
                "\n\uD83D\uDE3C Experiencia: " + experience +
                "\n\uD83D\uDE3C Ataque: " + attack +
                "\n\uD83D\uDE3C Defensa: " + defense);

    }
    public int attackPlayer1(){
        int hitPlayer1 = random.nextInt(maxAttak);
        hitPlayer1 = hitPlayer1 - health;
        experience += gainExpo;

        return Math.abs(hitPlayer1);
    }
    public void levelUp(){
        if (experience >= 50){
            health = health + expoGainHealth;
            attack++;
            defense++;
            level++;
        }
    }
}
