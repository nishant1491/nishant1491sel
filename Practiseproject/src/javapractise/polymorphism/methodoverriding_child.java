package javapractise.polymorphism;

public class methodoverriding_child extends methodoverriding {

    @Override

    void method1(){

        System.out.println("Execute the child method1");
    }
    @Override
    void method2(){
        System.out.println("Execute the child method2");

    }

    void method5(){

        System.out.println("Execute the method5");
    }

    void method6(){

        System.out.println("Execute the method6");
    }


    public static class  methodoverriding_child2 extends methodoverriding_child{

        @Override
        void method1(){
            System.out.println("Execute the method child of child method1");
        }

        @Override
        void method2(){

            System.out.println("Execute the method child of child method2");
        }

      @Override
        void method3(){
            System.out.println("Execute the method child of child method3");
        }
    }


    public static void main(String[] args) {
        System.out.println("Methods of child: ");
        methodoverriding_child obj1=new methodoverriding_child();
        obj1.method1();
        obj1.method2();
        obj1.method5();
        obj1.method6();

        System.out.println("Methods of parent: ");
        methodoverriding obj2=new methodoverriding();
        obj2.method1();
        obj2.method2();
        obj2.method3();
        obj2.method4();

        System.out.println("Dynamic dispatching: ");
        methodoverriding obj3=new methodoverriding_child();
        obj3.method1();
        obj3.method2();
        obj3.method3();
        obj3.method4();

        System.out.println("Loose coupling: ");
        obj3=new methodoverriding_child2();
        obj3.method1();
        obj3.method2();
        obj3.method3();
        obj3.method4();





    }
}
