package Ejercicio7;

import java.util.List;
import java.util.Random;

public class Serpiente {
    Random random = new Random();
    private int age;
    List<Character> bodySnake;

    public Serpiente(int age, List<Character> bodySnake) {
        this.age = age;
        this.bodySnake = bodySnake;
    }

    private void snakeBorn(){
        int initialLength = random.nextInt(5);
        for (int i = 0; i < initialLength; i++){
            bodySnake.add(generateNewColor());
        }
    }
    private char generateNewColor(){
        char[] colors = {'a','v','c'};
        return colors[random.nextInt(colors.length)];
    }
    void simulateLife(){
        snakeBorn();

        while(isSnakeAlive()){
            age++;
            System.out.println("Edad de la serpiente: " + age
            + "\nEstado de la serpiente: " + bodySnake);
            if (age < 10){
                snakeGrow();
                snakeShedSkin();
            } else {
                snakeDecrease();
            }
            snakeGetsAttacked();
        }

    }
    private boolean isSnakeAlive(){
        return !bodySnake.isEmpty();
    }
    private void snakeGrow(){
        if (random.nextInt(0,10) >= 2){
            bodySnake.add(generateNewColor());
            System.out.println("La serpiente ha crecido!!");
        }
    }
    private void snakeDecrease(){
        if (random.nextInt(0,10) >= 9){
            bodySnake.remove(bodySnake.size() - 1);
            System.out.println("La serpiente ha mudado su piel");
        }
    }
    private void snakeGetsAttacked(){
        if (random.nextInt(0,10) >= 9){
            bodySnake.clear();
            System.out.println("La serpiente ha muerto");
        }
    }

    private void snakeShedSkin(){
        for (int i = 0; i < bodySnake.size(); i++){
            char newColor = generateNewColor();
            bodySnake.set(i, newColor);
        }
    }
}
