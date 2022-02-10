package javapractise;

public class String_4 {

    public static void main(String[] args) {
        //StringBuffer class is thread safe (synchronized) where as StringBuilder class is not thread safe.

        String S1=new String("Hello Original");
        String S2=new String("Hello Duplicate");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S1.concat(S2));
        System.out.println(S1);

        StringBuffer stringBuffer=new StringBuffer("Hello String buffer class");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.append("Hello new String buffer class"));

        //String does not remain immutable it can immutate with string buffer class
        System.out.println(stringBuffer);



    }




}
