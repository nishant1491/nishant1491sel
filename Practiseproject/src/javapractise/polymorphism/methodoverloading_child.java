package javapractise.polymorphism;

public class methodoverloading_child extends methodoverloading {


    void childOverloading(){

        System.out.println("No arg child method");
    }

    void childOverloading(int a,int b,int c,int d){

        System.out.println(" Four arg int child method");

    }

void childOverloading(String a,String b,String c,String d){

    System.out.println("Four arg string child method");
}


    public static void main(String[] args) {

        methodoverloading_child child=new methodoverloading_child();
        child.childOverloading();
        child.childOverloading(10,20,30,40);
        child.childOverloading("Nishant","Dattatray","Anita","Komal");

        child.overloadMethod();
        child.overloadMethod(10);
        child.overloadMethod(20,40,60);
        child.overloadMethod("Komal","Shejul");
    }


}

