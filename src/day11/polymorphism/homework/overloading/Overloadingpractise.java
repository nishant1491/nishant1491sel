package day11.polymorphism.homework.overloading;

public class Overloadingpractise {

    //Overloading is having method with same signature but passing different arguments
    //The no of arguments,type of arguments and sequence of the arguments can be different

    //Create methods of different return types and pass different argument to overload a method

    public void methodoverload(){

        System.out.println("This is a noarg method");
    }

    public void methodoverload(int i){

        System.out.println("This is a one arg integer method");
    }

    public void methodoverload(String s,String b){

        System.out.println("This is two arg string method");
    }

    public void methodoverload(int j,String c,double d){

        System.out.println("This is a 3 arg int,string and double arg method");
    }


    public static void main(String[] args) {

        System.out.println("Call all the overloaded methods");

        Overloadingpractise obj=new Overloadingpractise();
        obj.methodoverload();
        obj.methodoverload(10);
        obj.methodoverload("Nishant","Shejul");
        obj.methodoverload(100,"Dattatray",100.5);
    }



}
