package day11.polymorphism.homework.overriding;

public class Overridingpractise1 extends Overridingpractise{
    @Override
    public void methodM1(){

        System.out.println("This is a method M1 overridden in child class");
    }

    public void methodM2(){

        System.out.println("This is a method M2 overridden in child class");

    }

    public void methodM5(){

        System.out.println("This is method M5 in a child class");

    }

    public void methodM6(){

        System.out.println("This is a method M6 in a child class");

    }

    public static class Overridingpractisenew extends Overridingpractise1{
      @Override
        public void  methodM1(){

          System.out.println("Overidden method in 2nd child class");

        }
@Override
       public  void methodM2(){

           System.out.println("Overidden method in 2nd child class");
        }

         void methodM7(){

            System.out.println("Method in 2nd child class");
        }

        public void methodM8(){

            System.out.println("Method in 2nd child class");
        }

    }




    public static void main(String[] args) {

        Overridingpractise object1=new Overridingpractise();
        //object1.methodM1();

        Overridingpractise1 object2=new Overridingpractise1();
        //object2.methodM2();

        //Dynamic dispatching
        //Calling only overriden methods in child class or methods from parent classs

        Overridingpractise object3=new Overridingpractise1();
        object3.methodM1();
        object3.methodM2();
        object3.methodM3();
        object3.methodM4();

        //Loose coupling
        //Calling only overriden methods in child class or methods of parent class
        //Specific child methods cannot be called

        object3=new Overridingpractisenew();
        object3.methodM1();
        object3.methodM2();




    }


}
