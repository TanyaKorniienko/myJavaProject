package Homework;

public class MainClass {
    public static void main(String[] args) {
        AppData csvData = new AppData();
        csvData.writeToCSVFile();
        csvData.readCSVFile();
    }
}
