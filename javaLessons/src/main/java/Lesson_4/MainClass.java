package Lesson_4;


public class MainClass {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];

        Cat cat = new Cat("Барсик", 9, false);
        Cat cat2 = new Cat("Пушок", 7, true);

        cat.run(200);
        cat.swim(0);
        cat2.run(100);
        cat2.swim(0);


        Dog dog = new Dog("Макс");
        Dog dog2 = new Dog("Jack");
        dog.run(500);
        dog.swim(10);
        dog2.run(400);
        dog2.swim(7);


        System.out.println("Общее количество котов = " + (Cat.getCount()));
        System.out.println("Общее количество собак = " + (Dog.getCount()));
        System.out.println("Общее количество животных = " + (Animal.getCount()));


    }

}


abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    abstract void run(int length);
    abstract void swim(int length);
    static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
    String name;
    int appetite;
    private final int MAX_RUN_LENGTH = 200;
    static int count;
    static boolean fullness;


    Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = true;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println(name + " " + "пробежала:" + length);
        } else {
            System.out.println(name + " " + "нужно тренироваться еще!");
        }
    }

    @Override
    void swim(int length) {
        System.out.println(name + " " + "кошка и она не плавает!");
    }

    public void eat(int food) {
        return;
    }
}

class Dog extends Animal {
    private String name;
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    static int count;

    Dog(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println(name + " " + "пробежал:" + length);
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println(name + " " + "проплыл:" + length);
        else System.out.println(name + " " + "нужно тренироваться еще!");
    }

}


