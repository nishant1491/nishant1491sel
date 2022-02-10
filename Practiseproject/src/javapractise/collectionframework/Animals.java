package javapractise.collectionframework;

import javapractise.encapsulation.A;

import java.util.ArrayList;
import java.util.List;

public class Animals {


    public static void main(String[] args) {

        List<Animals> Animals=new ArrayList<>();
        Cat obj1=new Cat();
        Dog obj2=new Dog();

        obj1.methodM2();
        obj2.methodM1();

        for (Object value1: Animals)
        {
            System.out.println(obj1);
            System.out.println(obj2);
        }

    }


}

   class Dog extends Animals{

      public void methodM1(){

          System.out.println("Return Dog method");

      }

  }

  class Cat extends Animals{

    public void methodM2(){
        System.out.println("Return Cat method");

    }

  }