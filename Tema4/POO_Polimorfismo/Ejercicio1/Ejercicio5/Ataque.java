package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public class Ataque {
    private int damageCaused;
    private int fisicDamage;
    private int magicDamage;
    public enum damageType{
        CUERPO_a_CUERPO, A_DISTANCIA
    }
    static damageType damageType;

    public Ataque (damageType damageType){
        this.damageType = damageType;
    }

    public void setFisicDamage(int fisicDamage) {
        this.fisicDamage = fisicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getFisicDamage() {
        return fisicDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public int getDamageCaused() {
        return damageCaused;
    }

    public damageType getDamageType() {
        return damageType;
    }

    public String toString(){
        return "⚔\uFE0F INFORMACION COMBATIENTE ⚔\uFE0F" +
                "\nTipo de daño: " + damageType ;
    }
}
