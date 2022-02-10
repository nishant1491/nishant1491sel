package javapractise;

public class Objectmultiarray {

    public static void main(String[] args) {


        java.lang.Object[][] objmultiarray = new java.lang.Object[][]{{"Name", "Nishant Shejul"}, {"Age", 30}, {"Empid", 104899}, {"Bloodgrp", "O+"}};


        for (int i = 0; i<objmultiarray.length;i++){

            for (int j=0;j< objmultiarray[i].length;j++){

                System.out.print(objmultiarray[i][j]+" ");

            }
            System.out.println();

        }
    }
}
