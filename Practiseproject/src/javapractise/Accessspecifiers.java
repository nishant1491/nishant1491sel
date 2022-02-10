package javapractise;

public class Accessspecifiers {

     void  Method1(){

        System.out.println("Public class method");
    }

    protected static class Protectedaccessspecifier{

        void protectedMethod(){
            System.out.println("Protected class Method");

        }
    }

    public static void main(String[] args) {

        Protectedaccessspecifier obj1=new Protectedaccessspecifier();
        obj1.protectedMethod();

    }


}

 class Accessspecifiers1{

    void Method2(){

        System.out.println("Default class method");

    }

    private static class Privateaccessspecifier{

        void Method3(){

            System.out.println("Private class method");

        }

    }

     public static void main(String[] args) {
        Privateaccessspecifier obj4=new Privateaccessspecifier();
        obj4.Method3();

     }

}

 class callingMethods{


     public static void main(String[] args) {


         Accessspecifiers obj1=new Accessspecifiers();
         obj1.Method1();

         Accessspecifiers1 obj2=new Accessspecifiers1();
         obj2.Method2();


     }


}
