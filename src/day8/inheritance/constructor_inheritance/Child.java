package day8.inheritance.constructor_inheritance;

public class Child extends Parent{
    /**
     * 1- Inside child's constructor , at the first line Parent's default constructor is automatcially called
     */
    public Child()
    {
        super(); //this is invisibly present
        System.out.println("In Child's no-arg const..");
    }

    public Child(int i)
    {
        super(10);
        System.out.println("In Child's one-INT-arg const..");
    }

    public Child(String a){
        super("Nishant");
        System.out.println("In Child's string-one arg const");
    }

    public Child(String a, String b){
        //super(10,"Komal");
        this();
        System.out.println("In Child's string-two arg const");
    }


    public void m2(){
        System.out.println("Child's m2()..");
    }

    public static void main(String[] args) {
//       Child c1 = new Child();
//        c1.m1();
//        c1.m2();
//        System.out.println("*************************");
//        Child c2 = new Child(100);
//        c2.m1();

        System.out.println("*************************");
        //new Child();
        //new Child(10);
        //new Child("Nishant");
        new Child("Nishant","Sagar");

    }

}

