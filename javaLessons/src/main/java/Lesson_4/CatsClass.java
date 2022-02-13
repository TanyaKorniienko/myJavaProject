package Lesson_4;

public class CatsClass {
    public static void main(String[] args) {

        Plate plate = new Plate(10);

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5, true);
        allCats[1] = new Cat("Бублик", 3,  true);
        allCats[2] = new Cat("Мурзик", 5,  false);
        allCats[3] = new Cat("Пушок", 5,  true);


        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].fullness && allCats[i].appetite < plate.food) {
                allCats[i].fullness = true;
                allCats[i].eat(plate.food);
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
            }
        }
        plate.info();
    }
}
class Cat2 {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat2(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(int food) {
        return;
    }

    class Plate {
        public int food;
        void Plate(int food) {
            this.food = food;
        }
    }
}
