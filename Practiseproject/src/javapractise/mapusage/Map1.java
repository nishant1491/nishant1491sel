package javapractise.mapusage;

import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

    public static void main(String[] args) {

        //Map is a interface which contains two classes Hashmap and Hashtable

        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("Name","Nishant Dattatray Shejul");
        hashmap.put("phnno","9850681356");
        hashmap.put("Address","Netainagar,Dattmandir road");
        hashmap.put("Pincode","411061");
        hashmap.put(null,null);

        System.out.println(hashmap.size());

        System.out.println(hashmap.get("Name"));

        hashmap.replace("Name","Komal Nishant Shejul");

        System.out.println(hashmap.get("Name"));

        Set<String> keys=hashmap.keySet();
        System.out.println(keys);

        Set<Map.Entry<String, String>> entrys=hashmap.entrySet();
        System.out.println(entrys);

        Collection<String> hashvalues = hashmap.values();
        System.out.println(hashvalues);

        for (String str1:keys)
        {
            System.out.println(str1);
        }

        for (String str2:hashvalues)
        {
            System.out.println(str2);

        }




    }

}
