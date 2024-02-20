package POO_Polimorfismo.Ejercicio1.Ejercicio3;
import java.util.Random;
public class ProbabilidadAnimal {
    public int chance;

    public ProbabilidadAnimal(int chance) {
        this.chance = chance;
    }
    public boolean chanceAnimal(){
        boolean doesItAttack = false;
        if(chance < 95){
            System.out.println("se ha ido corriendo");
        } else {
            System.out.println("Va a atacar");
            doesItAttack = true;
        }
        return doesItAttack;
    }

}
