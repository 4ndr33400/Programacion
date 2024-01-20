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

    public static final int DEFAULT_HEALTH = 400;
    public static final int DEFAULT_ATTACK = 100;
    public static final int DEFAULT_DEFENSE = 100;

    public final int potion = 10;
    public final int rest = 50;

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
        if (level > 1){
            this.level = level;
        }
    }

    public int drinkPotion(){
        health = health + potion;
        if (health > maxHealth){
            health = maxHealth;
        }
        return health;
    }
    public int rest(){
        health = health + rest;
        if (health > maxHealth){
            health = maxHealth;
        }
        return health;
    }
    public void infoCharacters(){
        System.out.println("----------------------------------------------------" +
                "\n⚔\uFE0F " + name + " ⚔\uFE0F "+
                "\n\uD83D\uDE3C Nivel: " + level +
                "\n\uD83D\uDE3C Vida: " + health +
                "\n\uD83D\uDE3C Experiencia: " + experience +
                "\n\uD83D\uDE3C Ataque: " + attack +
                "\n\uD83D\uDE3C Defensa: " + defense);
    }
    public int attackPlayer(Hero hero1, Hero hero2){
        int hitPlayer = random.nextInt(hero1.attack - hero2.defense , 100);
        hero2.health -= hitPlayer;
        if (hero2.health < 0) {
            hero2.health = 0;
        }
        experience += 10;
        if (experience >= 50) {
            levelUp();
        }
        System.out.println("daño : " + hitPlayer + " vida : " + hero2.health);
        return hero2.health;
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
