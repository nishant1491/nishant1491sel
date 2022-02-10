package javapractise;

public class  Datatype {


    //primitive datatypes

    byte b=10; //8 bit

    short s=1000;//16 bit

    int i= 100000;//32 bit

    long l=560000;//64 bit

    //decimal datatypes

    float f=32.2f;

    double d=64.2d;

    //String is not a datatype but it is a final class in java

    String str="Nishant";

    //Character datatype

    char c='A';

    //Boolean datatype

    boolean bool=true;

    //Every class can also be used as a datatype mainly while creating objects



    public static void main(String[] args) {

        Datatype datavariable=new Datatype();
        //You can call all the varaibles in the public method

        System.out.println("Byte variable value is"+datavariable.b);
        System.out.println("Short variable is"+datavariable.s);
        System.out.println("Int variable is"+datavariable.i);
        System.out.println("Long varaible is"+datavariable.l);

        System.out.println("Float variable value is"+datavariable.f);
        System.out.println("Double variable value is"+datavariable.d);

        System.out.println("String variable value is"+datavariable.str);
        System.out.println("Character variable value is"+datavariable.c);
        System.out.println("Boolean variable value is"+datavariable.bool);



    }


}
