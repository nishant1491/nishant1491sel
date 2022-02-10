public class String_2 {


    public static void main(String[] args) {

        String s1="Hi Nishant,how are you,are you fine?";


        String[] stringrray=s1.split(",");

        for(int i=0;i<stringrray.length;i++)
        {

            System.out.println(stringrray[i]);

        }


    }


}
