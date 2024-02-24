package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public interface ICombatiente {
    Ataque attack();
    void defense(Ataque ataque);
    boolean isAlive();
}
