package lesson_3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \nДолжность: %s \nEmail: %s \nНомер телефона: %s \nЗарплата: %d \nВозраст: %d\n",
                name, position, email, phone, salary, age);
    }

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee [] employeeArray = new Employee[5];
        employeeArray [0] = new Employee("Иванова Ирина Петровна", "Менеджер", "irina@gmail.com", "380973878883",10000, 34);
        employeeArray [1] = new Employee("Петров Юрий Николаевич", "Механик", "petrov@gmail.com","380938475399", 20000, 45);
        employeeArray [2] = new Employee("Васильева Ольга Дмитриевна", "Секретарь", "olga@gmail.com", "380959577999", 10000, 39 );
        employeeArray [3] = new Employee("Опанасенко Михаил Олегович", "Старший менеджер", "opanasenko@gmail.com", "380508294208", 30000, 48);
        employeeArray [4] = new Employee("Денисенко Яна Олеговна", "Бухгалтер", "yana@gmail.com", "8063873555", 10000, 28 );

        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].age > 40) {
                employeeArray[i].print();
            }
        }
    }
}
