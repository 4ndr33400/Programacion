package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public class Ataque {
    private int damageCaused;
    private String damageType;
    private String attackType;

    public Ataque(String damageType, String attackType, int damageCaused) {
        this.damageCaused = damageCaused;
        this.damageType = damageType;
        this.attackType = attackType;
    }

    public int getDamageCaused() {
        return damageCaused;
    }

    public String getDamageType() {
        return damageType;
    }

    public String getAttackType() {
        return attackType;
    }

    public String toString(){
        return "⚔\uFE0F INFORMACION COMBATIENTE ⚔\uFE0F" +
                "\nTipo de daño: " + damageType +
                "\n Tipo de Ataque: " + attackType;
    }
}
