package javapractise.Exception_handling;

public class Exph2 {

    public static int m1(int a, int b) {

         return a/b;
    }

    public static int m2(String s1) {

        int integer1 = Integer.parseInt(s1);
        return integer1;

    }

    public static int m3(String s2) {

        return s2.length();
    }

    public static Object[] Objectsarray(Object[] objects1) {

        System.out.println("In object method");
        Object[] objects2 = new Object[5];
        for (int i = 0; i < objects1.length; i++) {

            objects2[i] = objects1[i] + "Hello";
            System.out.println(objects2[i]);
            System.out.println(objects1[i]);

        }
        return objects1;
    }


    public static void main(String[] args) {
        try {
            System.out.println(m1(10, 2));
            System.out.println(m2("1234"));
            System.out.println(m3("null"));
            Object[] objects1 = new Object[]{1, 2, 3, 4, "String"};
            System.out.println(Objectsarray(objects1));


        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("Pass the correct values");
        }
        catch (NumberFormatException numberFormatException){
            System.out.println("Pass the correct values");
        }
        catch (NullPointerException nullPointerException){
            System.out.println("Pass the correct values");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Pass the correct values");
        }
        catch (Exception exception){
            System.out.println("Pass the correct values");
        }
        finally {
            System.out.println("Final block");
        }

    }
}
