package day4;

public class PtwodimArray {

    public static void main(String[] args) {
        int[][] twodimArray = new int[3][4];

        twodimArray[0][0] = 10;
        twodimArray[0][1] = 20;
        twodimArray[0][2] = 30;
        twodimArray[0][3] = 60;
        twodimArray[1][0] = 40;
        twodimArray[1][1] = 50;
        twodimArray[1][2] = 60;
        twodimArray[1][3] = 150;
        twodimArray[2][0] = 70;
        twodimArray[2][1] = 80;
        twodimArray[2][2] = 90;
        twodimArray[2][3] = 240;

        for (int i=0; i<twodimArray.length; i++) {

            for (int j=0; j<twodimArray[i].length; j++)
            {
                System.out.print(twodimArray[i][j] + " ");

            }

            System.out.println();
        }

    }
}
