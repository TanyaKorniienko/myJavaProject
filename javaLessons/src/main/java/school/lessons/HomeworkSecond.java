package school.lessons;

public class HomeworkSecond {
    public static void main(String args[]) {
        System.out.println(between10and20(11, 5));
        findNum(8);
        System.out.println(isNunNegative(-6));
        printResult("John", 3);
        System.out.println(checkYear(2020));
        arrFirst();
        fillArray();
        changeArray();
        fillDiagonal();
        createArray(3, 5);
    }


    //Задание №1
    public static boolean between10and20(int x, int y) {
        if (x + y > 10 && x + y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание №2
    public static void findNum(int z) {
        if (z < 0) {
            System.out.println("Отрицательное число");
        } else if (z >= 0) {
            System.out.println("Положительное число");
        }
    }

    //Задание №3
    public static boolean isNunNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание №4
    public static void printResult(String name, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println("Привет, " + name + "!");
        }
    }

    //Задание №5
    public static boolean checkYear(int year) {
        //if ((year % 4 == 0) || !(year % 100 == 0) && (year % 400 == 0)) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задание *
    public static void arrFirst() {
        int[] arr = {0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
    }

    //Задание №6
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + i);
        }
    }

    //Задание №7
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }

    //Задание №8
    public static void fillDiagonal() {
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((arr[i][j]));
            }
            System.out.println();
        }
    }

    //Задание №9
    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
    }

    public static void showArray(int[] newArray) {
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
}
