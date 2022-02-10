package javapractise;

public class Array {


    public static void main(String[] args)
    {


        int[] intarray=new int[5];

        intarray[0]=10;
        intarray[1]=20;
        intarray[2]=30;
        intarray[3]=40;
        intarray[4]=50;


        int intarraylength=intarray.length;

        System.out.println("Length of the array"+intarraylength);

        for (int i=0;i<intarraylength;i++)
        {

            System.out.println("Print the array numbers: "+intarray[i]);

        }






    }

}
