package day2;

public class Method {

    public static double divideNumber(float a,float b)
    {
        System.out.println("Division of two numbers method");
        return a/b;
    }


    public static void main(String[] args) {

         double divide=divideNumber(300,37);
         System.out.println("Division of two numbers is " +divide);
    }

}
