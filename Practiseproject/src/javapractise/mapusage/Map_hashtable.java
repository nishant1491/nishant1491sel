package javapractise.mapusage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Map_hashtable {

    public static void main(String[] args) {
        Map<String,String> hashtable=new Hashtable<>();
        hashtable.put("Team","Arsenal");
        hashtable.put("Player","Odegaard");
        hashtable.put("Number","10");
        hashtable.put("Position","CM");
        hashtable.put("null","null");


        System.out.println(hashtable.size());
        System.out.println(hashtable.keySet());
        System.out.println(hashtable.entrySet());
        System.out.println(hashtable.values());

        for (String str1:hashtable.keySet()) {

            System.out.println(str1);
        }

        for (Map.Entry<String, String> str2:hashtable.entrySet()) {

            System.out.println(str2);

        }

        for(String str3:hashtable.values())
        {
            System.out.println(str3);
        }


    }


}
