package Lesson_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] array = new Integer[3];
        array[0] = 25;
        array[1] = 72;
        array[2] = 58;
        System.out.println("Изначальнй вид массива (до смены элементов местами): "+ Arrays.toString(array));

        swapElements(array, 0, 1);
        System.out.println("Меняем 1й и 2й элементы массива местами: "+ Arrays.toString(array));

        Apple app = new Apple();
        Orange orange = new Orange();

        System.out.println(app.getWeight());
        System.out.println(orange.getWeight());

        Box<Apple> appleBox = new Box<Apple>(app, 5);
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<Orange>(orange, 7);
        System.out.println(orangeBox.getWeight());


        System.out.println();
        System.out.println(orangeBox.compare(appleBox));

    }

    private static void swapElements(Object[] arr, int num1, int num2) {
        Object t = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = t;
    }

}
abstract class Fruit {
    private float weight;

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    Fruit(){
    }
}

class Orange extends Fruit {
    Orange() {
        this.setWeight(1.5f);
    }
}

class Apple extends Fruit {
    Apple() {
        this.setWeight(1.0f);
    }
}


