package javapractise.polymorphism;

public class methodoverloading {


    void overloadMethod(){

        System.out.println("No arg method");
    }

    void overloadMethod(int i){

        System.out.println("One arg int method");

    }

    public void overloadMethod(int a,int b,int c){

        System.out.println("Three arg int method");

    }

    void overloadMethod(String s1,String s2){

        System.out.println("Two arg string methods");

    }




    public static void main(String[] args) {

        methodoverloading obj=new methodoverloading();
        obj.overloadMethod();
        obj.overloadMethod(10);
        obj.overloadMethod(10,20,30);
        obj.overloadMethod("Nishant","Shejul");


    }



}
