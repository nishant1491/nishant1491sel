package javapractise.collectionframework;

import java.util.ArrayList;
import java.util.List;

//Use add to add the values
//Use get the value for any specific index
public class Arraylist2 {

    public static void main(String[] args) {

        List<Integer> phnno= new ArrayList<>();
        phnno.add(12331444);
        phnno.add(8979797);
        phnno.add(1313131);
        phnno.add(13131313);
        phnno.add(1313131322);

        System.out.println(phnno.size());

        for(int i=0;i<phnno.size();i++){

            if(phnno.get(i) >= 13131313)
                System.out.println(phnno.get(i));

        }

    }


}


