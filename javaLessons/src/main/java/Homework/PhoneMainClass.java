package Homework;

public class PhoneMainClass {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("0965753324", "Богданов");
        phonebook.add("0987997600", "Иванов");
        phonebook.add("0975653321", "Иванов");
        phonebook.add("0501883553", "Михайлов");
        phonebook.add("0631980315", "Михайлов");

        phonebook.get("Богданов");
        phonebook.get("Иванов");
        phonebook.get("Михайлов");
        phonebook.get("Андреенко");
    }
}
