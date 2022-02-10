package javapractise;

public class Statics {


    static void Method1(){

        System.out.println("Print the data for method1");
    }


     int Method2(){

        System.out.println("Print the data for method2");
        return 0;
    }

    String Method3(){

        System.out.println("Print the data for method3");
        return "No value";
    }

    public static void mainMethod(){

        System.out.println("Print the data for mainMethod ");
    }

    public static void main(String[] args) {
        //Static to static calling can be directly done using method name
        Method1();
        mainMethod();

        //Object creation required for calling non-static members from static member
        Statics obj1=new Statics();
        obj1.Method2();
        obj1.Method3();

    }


}
