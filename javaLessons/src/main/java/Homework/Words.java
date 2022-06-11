package Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList(
                "May", "March", "June", "April", "January", "June", "July", "August",
                "September", "October", "November", "December", "February", "July", "May");

        System.out.println("Вид массива с дубликатами: " + wordList);

        HashSet<String> setOfWords = new HashSet<>(wordList);
        System.out.println("Уникальные значения массива: " + setOfWords);

        for (String s : setOfWords) {
            System.out.println("Значение массива " + s + " " + "встречается " + Collections.frequency(wordList, s) + "р.");
        }
    }
}
