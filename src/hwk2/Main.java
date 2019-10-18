package hwk2;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();

    }
}


class Display {
    private int value = 0;
    private int limit = 0;

    public Display( int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

}

class Clock {
    private Display hour;
    private Display minute;
    private Display second;


    public Clock( int hour, int minute, int second) {
        this.hour = new Display(hour, 24);
        this.minute = new Display(minute, 60);
        this.second = new Display(second, 60);
    }

    public void tick() {
        second.increase();
        if (second.getValue() == 0) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
        }
    }

    public String toString() {
        String str = null;
        str = String.format("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
        return str;
    }


}
