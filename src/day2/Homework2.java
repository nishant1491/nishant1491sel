package day2;

public class Homework2 {

    //Object creation and accessing varables and methods in the class


    int a=20;
    int b=30;

    public int method1()
    {
       int i=40;
       int j=50;

       int addition=i+j;
       return addition;
    }

    public static void main(String[] args) {

        Homework2 obj=new Homework2();
        System.out.println("The execution of method1 is :"+obj.method1());
        System.out.println("Value of a is :"+obj.a);
        System.out.println("Value of b is :"+obj.b);

        obj.a=50;
        obj.b=60;
        System.out.println("Value of a is :"+obj.a);
        System.out.println("Value of b is :"+obj.b);

        Homework2 obj1=new Homework2();
        System.out.println("Value of a is :"+obj1.a);
        System.out.println("Value of a is :"+obj1.b);


    }

}
