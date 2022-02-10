package inheritance;

public class Q extends P {

    int j=20;

    public void method2(){

        System.out.println("Print the output of method2");
    }


    public static void main(String[] args) {

        Q obj1=new Q();
        obj1.method1();
        obj1.method2();

        System.out.println("Variable of class P"+obj1.i);

    }


}
