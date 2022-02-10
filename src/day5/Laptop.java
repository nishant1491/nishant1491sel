package day5;

public class Laptop {

    int powerButton;
    int screen;
    String keys;


    public void laptopStart(String a){
        System.out.println("Laptop has started");
    }

    public void laptopRunning(boolean a){

        System.out.println("Laptop is running");
    }

    public static void main(String[] args) {

        Laptop power=new Laptop();
        Laptop run=new Laptop();


        power.laptopStart("Press the power button");

        run.laptopRunning(true);

        power.powerButton=10;
        power.keys="Space";
        int powerButton;
        String keys;

        System.out.println("value of powerButton:"+power.powerButton);
        System.out.println("value of keys: "+power.keys);

    }


}
