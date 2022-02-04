package school.lesson;

public class HomeworkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        String str1 = "Orange";
        String str2 = "Banana";
        String str3 = "Apple";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 2;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        //System.out.println();
    }
    public static void printColor() {
        int value = 125;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 14;
        int b = 10;
        if (a > b || a == b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
