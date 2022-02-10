package javapractise.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Objectlist {

    public static void main(String[] args) {

        List<Object> objects=new ArrayList<>();
        objects.add("Nishant");
        objects.add(14);
        objects.add("January");
        objects.add(1991);

        System.out.println("Size of the arraylist"+objects.size());

        int i= objects.size()-1;

        //Print the values in reverse order
        while (i>=0){

            System.out.println(objects.get(i));
            i--;
        }

         i=0;
        //Print the values in added order
        while(i<=objects.size()-1){
            System.out.println(objects.get(i));
            i++;

        }


    }

}
