package javapractise.abstraction;

public class Class4 extends Class3 implements Interface3,Interface4 {

    @Override
    public void call4(){
        System.out.println("Call4 method 2nd time");

    }

    public void call5(){
        System.out.println("Call5 method 2nd time");

    }

    public void call6(){

        System.out.println("Call6 method 2nd time");
    }



    public static void main(String[] args) {

        Class4 obj1=new Class4();
        obj1.call1();
        obj1.call2();
        obj1.call3();
        obj1.call4();
        obj1.call5();
        obj1.call6();

    }



}
