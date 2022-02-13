package Lesson_4;


public class Park {
    String name;
    int price;
    String startTime;
    String endTime;

    public Park(String name, int price, String startTime, String endTime) {
        this.name = name;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        return "\nНазвание аттракциона:" + " " + name +
                "\nСтоимость билета" + " " + price +
                "\nНачало работы:" + " " + startTime +
                "\nКонец работы:" + " " + endTime +
                "\n";
    }
    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Park[] attractionArr = new Park[4];
        attractionArr[0] = new Park("Name1", 33, "10:00", "18:00");
        attractionArr[1] = new Park("Name2", 30, "11:00", "19:00");
        attractionArr[2] = new Park("Name3", 27, "10:00", "18:00");
        attractionArr[3] = new Park("Name4", 40, "10:00", "19:00");

        for (int i = 0; i < attractionArr.length; i++){
            System.out.print(attractionArr[i]);
        }
    }
}

