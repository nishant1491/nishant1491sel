package javapractise.collectionframework;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("Pune");
        cities.add("Nashik");
        cities.add("Mumbai");
        cities.add("Nagpur");

        for (String cityname:cities) {

            System.out.println(cityname);
        }

    }


}
