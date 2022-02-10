package javapractise.abstraction;

public abstract class Abstract {

    //abstract keyword to be added in class
    
    
    
    abstract void methodM1();
    abstract String methodM2();
    abstract int methodM3();
    
    void methodM4(){
        System.out.println("Not a abstarct method");
    }

    
     static class Abstract_child extends Abstract{


         @Override
         public void methodM1() {
             System.out.println("Implementation of methodM1");
         }

         @Override
         public String methodM2() {

             System.out.println("Display the required string");
             return "S";
         }

         @Override
         public int methodM3() {
             System.out.println("Implement a integer method");
             return 10;
         }

         Abstract_child (){

             System.out.println("Default constructor");
         }

         public static void main(String[] args) {


            Abstract_child obj1=new Abstract_child();
            obj1.methodM1();
            obj1.methodM2();
            obj1.methodM3();
            obj1.methodM4();





     }
    }



}
