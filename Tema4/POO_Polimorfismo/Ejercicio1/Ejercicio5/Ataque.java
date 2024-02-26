package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public class Ataque {
    private int damageCaused;
    enum damageType{
        CUERPO_a_CUERPO, A_DISTANCIA
    }
     enum attackType{
        FISICO, MAGICO
    }
    static damageType  damageType;
    static attackType attackType;

    public Ataque(damageType damageType, attackType attackType, int damageCaused) {
        this.damageCaused = damageCaused;
        this.damageType = damageType;
        this.attackType = attackType;
    }

    public int getDamageCaused() {
        return damageCaused;
    }

    public damageType getDamageType() {
        return damageType;
    }

    public attackType getAttackType() {
        return attackType;
    }

    public String toString(){
        return "⚔\uFE0F INFORMACION COMBATIENTE ⚔\uFE0F" +
                "\nTipo de daño: " + damageType +
                "\n Tipo de Ataque: " + attackType;
    }
}
