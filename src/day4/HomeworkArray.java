package day4;

public class HomeworkArray {


    public static void main(String[] args) {

        Object[][] ageArray=new Object[][]{{"Nishant",30},{"Komal",27},{"Papa",59},{"Aai",53},{"Sagar",34}};


        System.out.println("no of rows "+ageArray.length);
        System.out.println("no of columns"+ageArray[0].length);

        for (int i=0;i<ageArray.length;i++)
        {
            for(int j=0;j<ageArray[i].length;j++)
            {
                System.out.print(ageArray[i][j]+" ");
            }
            System.out.println();
        }
        
        
        

    }


}
