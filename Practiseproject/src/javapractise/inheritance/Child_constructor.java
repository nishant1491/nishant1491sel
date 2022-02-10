package javapractise.inheritance;

public class Child_constructor extends Parent_constructor {

    public Child_constructor(){

        System.out.println("Child default construcor");
    }


    Child_constructor(int i,int j,int k){

        System.out.println("Child int three arg constructor");
    }


    private Child_constructor(String str1){
        super(10,20);
        System.out.println("Child private string one arg constructor ");
    }


    protected Child_constructor(boolean boo){
        System.out.println("Child protected boolean one arg cnstructor");
    }


    public static void main(String[] args) {

        new Child_constructor();
        new Child_constructor("Nishant");
        new Child_constructor(true);
    }




}
