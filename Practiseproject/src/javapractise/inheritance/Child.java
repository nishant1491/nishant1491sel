package javapractise.inheritance;

public class Child extends Parent {

    public void methodM5(){

        System.out.println("Child public method executed successfully");

    }

    void methodM6(){

        System.out.println("Child default method executed successfully");
    }


    private void methodM7(){

        System.out.println("Child private method executed successfully");
    }

    protected void methodM8(){

        System.out.println("Child protected method executed successfully");
    }

    public static void main(String[] args) {

        Child obj1=new Child();
        obj1.methodM5();
        obj1.methodM6();
        obj1.methodM7();
        obj1.methodM8();

        obj1.methodM1();
        obj1.methodM2();
        obj1.methodM4();


    }





}
