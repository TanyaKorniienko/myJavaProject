package Lesson_4;

public class Plate {
    public int food;

    Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "PLATE: " + food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }

    public void info() {
        return;
    }
}
