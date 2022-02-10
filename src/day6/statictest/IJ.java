package day6.statictest;

public class IJ {

    public static void test1(){

        System.out.println("Print the static test method");
    }

    public void test3(){

        System.out.println("Print the non-static test3 method");

    }

    public static void main(String[] args) {

        test1();
        IJ a1=new IJ();
        a1.test3();

      //Calling methods from class I

        I.method2();
        I a2=new I();
        a2.method1();

        //Calling methods from class J

        J.method4();
        J a3=new J();
        a3.method3();



    }





}
