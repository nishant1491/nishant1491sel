package inheritance;

public class R extends Q{

    int k=30;

    public void method3(){

        System.out.println("Print the output of method3");
    }


    public static void main(String[] args) {

        R object1=new R();
        object1.method2();
        object1.method1();
        System.out.println("variable of class P"+object1.i);
        System.out.println("variable of class Q"+object1.j);


    }


}
