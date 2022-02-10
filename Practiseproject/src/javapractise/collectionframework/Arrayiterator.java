package javapractise.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrayiterator {

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Nishant");
        names.add("Dattatray");
        names.add("Shejul");

        System.out.println(names.size());

        Iterator<String> namesadd=names.iterator();
        while (namesadd.hasNext()){

            System.out.println(namesadd.next());
        }


    }

}
