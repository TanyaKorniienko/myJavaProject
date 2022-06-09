package Homework;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;

    AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public AppData() {

    }

    @Override
    public String toString() {
        return "AppData{" + "header=" + Arrays.toString(header) + ", data=" + dataToString() + '}';
    }

    private String dataToString() {
        StringBuilder builder = new StringBuilder("[");
        for (int[] value : data) {
            builder.append(dataValueToString(value)).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    private String dataValueToString(int[] value) {
        StringBuilder builder = new StringBuilder("[");
        for (int intValue : value) {
            builder.append(intValue).append(",");
        }
        return builder.delete(builder.length() - 1, builder.length()).append("]").toString();
    }

    public void writeToCSVFile() {
        File file = new File("./homework7file.csv");
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(file));
            List<String> stringList = new ArrayList<>();
            stringList.add("Value 1; Value 2; Value 3");
            stringList.add("100; 200; 123");
            stringList.add("300; 400; 500");
            addStringToFile(stringList, file);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addStringToFile(List<String> stringList, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : stringList) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public void readCSVFile() {
        File file = new File("./homework7file.csv");
        try {
            CSVReader reader = new CSVReader(new FileReader(file));
            List<String[]> allData = reader.readAll();

            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

