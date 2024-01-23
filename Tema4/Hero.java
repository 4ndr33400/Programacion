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
    public int hitPlayer;

    public static final int DEFAULT_HEALTH = 400;
    public static final int DEFAULT_ATTACK = 100;
    public static final int DEFAULT_DEFENSE = 100;

    public final int potion = 10;
    public final int rest = 50;

    public final int gainExpo = 10;
    public final int expoGainHealth = 5;

    public Hero(String name, int level, int health, int attack, int defense) {
        this.name = name;
        setLevel(level);
        setHealth(health);
        setAttack(attack);
        setDefense(defense);
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {

       if (health > DEFAULT_HEALTH){
           this.health = DEFAULT_HEALTH;
       } else if (health < 0){
           this.health = 0;
       } else {
           this.health = health;
       }

    }

    public void setAttack(int attack) {
        if (attack > DEFAULT_ATTACK){
            this.attack = DEFAULT_ATTACK;
        } else {
            this.attack = attack;
        }
    }

    public void setDefense(int defense) {
       if (defense > DEFAULT_DEFENSE){
           this.defense = DEFAULT_DEFENSE;
       } else {
           this.defense = defense;
       }
    }
    public void setLevel(int level){
        this.level = 1;
    }

    public int drinkPotion(){
        setHealth(health + potion);
        return health;
    }
    public int rest(){
        setHealth(health + rest);
        return health;
    }
    public String toString(){
        String infoCharacter = "----------------------------------------------------" +

                "\n⚔\uFE0F " + name + " ⚔\uFE0F "+
                "\n\uD83D\uDE3C Nivel: " + level +
                "\n\uD83D\uDE3C Vida: " + health +
                "\n\uD83D\uDE3C Experiencia: " + experience +
                "\n\uD83D\uDE3C Ataque: " + attack +
                "\n\uD83D\uDE3C Defensa: " + defense;

        return infoCharacter;
    }
    public void attackPlayer(Hero otherHero){
        hitPlayer = random.nextInt(attack - otherHero.defense, 100);
        otherHero.setHealth(otherHero.health - hitPlayer);
        experience += 10;
        if (experience >= 50) {
            levelUp();
        }
        System.out.println("Daño : " + hitPlayer + " Vida : " + otherHero.health);
    }
    public void levelUp(){
        if (experience >= 50){
            setHealth(health + expoGainHealth);
            experience = 0;
            setHealth(attack++);
            setDefense(defense++);
            level++;
        }
    }
    public void healPlayer(Hero hero){
        if (health > 50){
            health = hero.drinkPotion();
        }
    }
}
