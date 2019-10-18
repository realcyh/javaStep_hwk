package hwk3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<String>();
        while (true) {
            String name = in.next();
            if (name.equals("###")) break;
            else {
                cities.add(name);
            }
        }
        for (int i=0; i<cities.size(); i++) {

        }
        System.out.println(cities.size());





        System.out.println(cities.indexOf("one"));

    }
}

class City {
    HashMap<String, Integer> city = new HashMap<String, Integer>();
    public void addDist(String name, int dist) {
        city.put(name, dist);
    }

    public int getDist(String name) {
        return city.get(name);
    }
}
