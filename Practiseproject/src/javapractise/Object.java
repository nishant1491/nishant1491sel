package javapractise;

import groovy.json.JsonOutput;

public class Object {

    public int printInteger() {

        System.out.println("Print the integer");

        return 0;

    }
}

   class Object2{

        int variable1=10;
        int variable2=20;

        int printDecimal(){

             System.out.println("Print the Decimal");
             return 0;

        }
   }

   class Object3{

        String printString(){

            System.out.println("Print the string");
             return "string";
        }
   }



     class Objectcalling{

    //Calling all the methods in different class
    public static void main(String[] args) {

        Object obj=new Object();
        obj.printInteger();

        Object2 obj2=new Object2();
        obj2.printDecimal();

        Object3 obj3=new Object3();
        obj3.printString();




    }








    }