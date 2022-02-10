package javapractise.collectionframework;

import java.util.*;

public class Addlist {

    public static void main(String[] args) {

        List<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Orange");


        List<String> Season=new LinkedList<>();
        Season.add("Summer");
        Season.add("Rainy");
        Season.add("Spring");
        Season.add("Winter");

        Set<String> cities=new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nashik");
        cities.add("Nagpur");

        fruits.addAll(Season);
        System.out.println(fruits);
        fruits.addAll(cities);
        System.out.println(fruits);

        System.out.println(fruits.contains("Rainy"));
        System.out.println(cities.contains("Mango"));

    }

}
