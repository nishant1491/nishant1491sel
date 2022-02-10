package day3;

public class StringArray {
    public static void main(String[] args) {
        String[] stringArray= new String[4];

        for (int i =0; i<stringArray.length;i++){
            stringArray[i] = "Pune"+i;
            System.out.println(stringArray[i]);
        }
    }
}
