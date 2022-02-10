package javapractise.inheritance;

public class Parent_constructor {


    //Class name should be used to create a constructor

    public Parent_constructor(){

        this(true);
        System.out.println("Parent Default constructor");

    }


    Parent_constructor(int i,int j){
        this("Nishant");
        System.out.println("Two int parent constructor");

    }

    private Parent_constructor(String str){

        this(true);//this is not allowed or cannot execute as the access is private
        System.out.println("One arg string private parent constructor");
    }


    protected Parent_constructor(boolean bool){

        System.out.println("One arg boolean protected parent constructor");

    }
}
