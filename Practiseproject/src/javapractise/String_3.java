package javapractise;

public class String_3 {

    public static void main(String[] args) {

        //String is immutable

        String S1="Hello Nishant";
        String S2="Hello Nishant";


        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());

        System.out.println(S1.equals(S2));
        System.out.println(S1==S2);

        String S3=new String("Hi komal");
        String S4=new String("Hi komal");

        System.out.println(S3.hashCode());
        System.out.println(S4.hashCode());

        System.out.println(S3.equals(S4));
        System.out.println(S3==S4);

         System.out.println(S1.concat(S3));

        System.out.println(S1.replaceFirst("Nishant","Dattatray"));
        System.out.println(S1.replaceAll(S1,"Hi Shejul"));
        System.out.println(S1);

    }

}
