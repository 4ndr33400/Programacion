package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public class Ataque {
    private int fisicDamage;
    private int magicDamage;
    private String attackType;

    public Ataque(int fisicDamage, int magicDamage, String attackType) {
        this.fisicDamage = fisicDamage;
        this.magicDamage = magicDamage;
        this.attackType = attackType;
    }

    public String toString(){
        return "⚔\uFE0F INFORMACION COMBATIENTE ⚔\uFE0F" +
                "\n Daño Fisico: " + fisicDamage +
                "\n Daño Magico: " + magicDamage +
                "\n Tipo de Ataque: " + attackType;
    }
}
