package javapractise;

public class Methodchaining {

    //Return type can be class name
    //Return type is class name for methods
     Methodchaining m1(){

         System.out.println("Method m1");
         return this;
    }

    Methodchaining m2(){

        System.out.println("Method m2");
        return this;
    }

    Methodchaining m3(){

        System.out.println("Method m3");
        return this;
    }

    Methodchaining m4(){

        System.out.println("Method m4");
        return this;
    }

    public static void main(String[] args) {

         Methodchaining obj1=new Methodchaining();
         obj1.m1().m2().m3().m4();

    }

}
