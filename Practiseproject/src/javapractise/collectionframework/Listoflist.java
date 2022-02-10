package javapractise.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Listoflist {

    public static void main(String[] args) {

        List<String> fruits=new ArrayList<>();
        fruits.add("Guava");
        fruits.add("Pomogreante");

        List<String> season=new ArrayList<>();
        season.add("Summer");
        season.add("Winter");

        List<List<String>> mainlist=new ArrayList<>();
        mainlist.add(fruits);
        mainlist.add(season);

        for (List<String> value1:mainlist) {

            for (String value2:value1) {

                System.out.print(" "+value2);
            }

        }


    }


}
