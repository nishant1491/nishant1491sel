package javapractise.abstraction;

import groovy.transform.Undefined;

public class Class2 implements Interface2{
    @Override
    public void methodM1() {
        System.out.println("Print the method 2nd time");
    }

    @Override
    public void methodM2() {
        System.out.println("Print the method 2nd time");
    }

    @Override
    public void methodM3() {
        System.out.println("Print the method 2nd time");
    }

    @Override
    public void methodM4() {
        System.out.println("Print the method 2nd time");
    }

    @Override
    public int methodM5(int i) {
        System.out.println("Print the method 2nd time");
        return 0;
    }

    @Override
    public String methodM6(String s, String s1) {
        System.out.println("Print the method 2nd time");
        return null;
    }


    public static void main(String[] args) {

        Class2 object1=new Class2();
        object1.methodM1();
        object1.methodM2();
        object1.methodM3();
        object1.methodM4();
        object1.methodM5(10);
        object1.methodM6("Nishant","Shejul");
        System.out.println("Integer value"+i);
        System.out.println("String value"+s);

    }


}
