package javapractise;

public class Methods {


    public int addNumber(int i){

    int var=10;
    int var1=20;

    int addition=var+var1;
    return addition;

    }

     public float adddecNumber(float value){

        float f1=11.11f;
        float f2=22.22f;

        float decaddition=f1+f2;
        return decaddition;

    }

    String concatenateString(String str) {

        String str1 = "Nishant";
        String str2 = "Shejul";

        String straddition = str1 + str2;
        return straddition;
    }

       long divisionInteger(long integer1){

           long value1= 100;
           long value2=10;

           long intdivision=value1/value2;
           return intdivision;
        }


    }


    class Methodscalling{


        public static void main(String[] args) {

            Methods m=new Methods();
            //.addNumber(10);
            //m.adddecNumber(20.30f);
            //m.concatenateString("Komal");
            //m.divisionInteger(40);
            System.out.println("Print the addition"+m.addNumber(10));
            System.out.println("Print the floating addtion"+m.adddecNumber(20.30f));
            System.out.println("Print the concatenated string"+m.concatenateString("Komal"));
            System.out.println("Print the division of integer"+m.divisionInteger(40));
        }


    }


