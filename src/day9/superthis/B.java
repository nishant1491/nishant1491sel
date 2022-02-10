package day9.superthis;

public class B extends A {

    int i = 20;
    public void m(){
        System.out.println("In B's m()..");
    }

    public B(){
        super();
        System.out.println("In B's default constructor");
    }

    public void test(){
        System.out.println("B's test() starts ...");
        super.m();
        this.m();
        System.out.println("Super class i-> " +super.i);
        System.out.println("Child class i->"+this.i);
        System.out.println("B's test() ends ...");
    }


    public static void main(String[] args) {
        B bObject = new B();
//        bObject.m();
//        System.out.println(bObject.i);

        System.out.println("***********************************");
        bObject.test();

    }

}
