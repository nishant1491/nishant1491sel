package javapractise.Exception_handling;

import java.sql.SQLOutput;

public class Exph1 {

    public static int method1(int a ,int b){

        return a/b;
    }

    public static Integer method2(String s){

       int i = Integer.parseInt(s);
        return i;
    }

     public static int method3(String string){

        return string.length();
     }


    public static void main(String[] args) {

        try {
            method1(10, 0);
        } catch (ArithmeticException arithmeticException) {

            System.out.println("Enter the correct value to get the correct output");
        }
        try {
            method2("abcd");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Enter the string with number values");
        }

        try {
            method3(null);
        } catch (NullPointerException nullPointerException) {

            System.out.println("Enter a logical value");
        }


    }

}
