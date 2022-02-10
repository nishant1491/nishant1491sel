package javapractise.encapsulation;

public class A {

    private int value1=10;

    private String str="Nishant";

    private float f=32.2f;


    public int methodM1(int i){
        int output=value1-i;
        System.out.print("Value of methodM1 is :"+output);

        return output ;

    }

    public String methodStr1(String j){

        String output=str+j;
        System.out.print("Value of methodStr1 is :"+output);
        return output;

    }

    public float methodBool(boolean b){

        float output=f;
        System.out.print("Value of methodBool is :"+output);
        return output;
    }


    public static void main(String[] args) {

        A obj1=new A();
        obj1.methodM1(5);
        System.out.println();
        obj1.methodStr1(" Shejul");
        System.out.println();
        obj1.methodBool(true);



    }



}
