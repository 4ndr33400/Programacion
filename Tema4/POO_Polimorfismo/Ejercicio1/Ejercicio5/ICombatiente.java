package POO_Polimorfismo.Ejercicio1.Ejercicio5;

public interface ICombatiente {
    Ataque attack();
    Ataque defense(Ataque ataque);
    boolean isAlive();
}
