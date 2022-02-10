package inheritance;

public class Test{
    public static void main(String[] args) {


            Dog a=new Dog();
        System.out.println("Legs displayed"+a.legs);
        System.out.println("Ears displayed"+a.ears);
        a.eat();
        a.run();
        a.sleep();

        //Methods in dog class
        a.watching();
        a.eating();
        System.out.println("Noes dislayed"+a.nose);
        System.out.println("Eyes displayed"+a.eyes);


        Tiger b=new Tiger();
        //Methods in tiger class
        b.roaring();
        b.smelling();
        System.out.println("Tails displayed"+b.tail);
        System.out.println("Eyes of tiger displayed"+b.eyes);



        






    }





}
