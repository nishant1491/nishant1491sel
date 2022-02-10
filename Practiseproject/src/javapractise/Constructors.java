package javapractise;

public class Constructors {


    public Constructors(){

        System.out.println("Default constructor");


    }
    Constructors(int i,int j){
        System.out.println("Two arg int constructor");
    }


   Constructors(String str1,String str2){
       System.out.println("Two arg string constructor");
   }

   Constructors(int i,String a,boolean b){

       System.out.println("Three arg int,string and boolean constructor");
   }


    public static void main(String[] args) {

        Constructors obj=new Constructors();
        Constructors obj1=new Constructors(10,20);
        Constructors obj2=new Constructors("Nishant","Shejul");
        Constructors obj3=new Constructors(10,"Komal",true);

    }




}
