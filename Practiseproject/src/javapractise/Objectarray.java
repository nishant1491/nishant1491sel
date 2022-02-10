package javapractise;

public class Objectarray {


    public static void main(String[] args) {

        //Object Array can except data for all the datatypes


        java.lang.Object[] Objectnew =new java.lang.Object[4];

        Objectnew[0]="Nishant";
        Objectnew[1]=30;
        Objectnew[2]=104899;
        Objectnew[3]="O+";

        for (int i=0;i<Objectnew.length;i++)
        {
            System.out.println("Print the details of Person: "+Objectnew[i]);

        }




    }


}
