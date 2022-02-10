package day2;

public class Homework1
        {
            //Create two methods which accept two integers and return its multiplication and subtraction

            public static int multipleMethod(int a,int b) {

                 System.out.println("Method used for multiplication  numbers");

                 int multiple=a*b;

                 return multiple;

            }

            public static int subtractMethod(int a,int b) {

                 System.out.println("Method used for subtraction of numbers");

                 int sub=a-b;

                 return sub;

            }



            public static void main(String[] args)
            {
                System.out.println("This is main method");

               int multiplication= multipleMethod(10,20);

               int subtraction= subtractMethod(55,11);

                System.out.println("Multiplication of two numbers is :"+multiplication);
                System.out.println("subtraction of two numbers is :"+subtraction);

            }



        }
