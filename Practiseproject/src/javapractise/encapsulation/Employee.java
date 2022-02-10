package javapractise.encapsulation;

public class Employee {

    private String name;
    private int phoneno;
    private int salary;
    private String address;


  //Setter methods has return type set as void as they are used to set the values

    public void setName(String name){

        this.name=name;
    }

    public void setPhoneno(int ph){

        this.phoneno=ph;
    }

    public void setSalary(int sal){

        this.salary=sal;

    }

    public void setAddress(String addr){


        this.address=addr;

    }


    public String getName(){

       return this.name;
    }

    public int getPhoneno(){

        return this.phoneno;
    }

    public int getSalary(){

         return this.salary;

    }

    public String getAddress(){


       return this.address;

    }







    public static void main(String[] args) {

        Employee obj1=new Employee();
        obj1.setName("Nishant");
        obj1.setPhoneno(9999999);
        obj1.setSalary(50000);
        obj1.setAddress("Pune");

        Employee obj2=new Employee();
        obj2.setName("Komal");
        obj2.setPhoneno(888888);
        obj2.setSalary(10000);
        obj2.setAddress("Nashik");


        System.out.println("Print the details of Employee1: "+obj1.getName()+" "+obj1.getPhoneno()+" "+obj1.getSalary()+" "+obj1.getAddress());


        System.out.println("Print the details of Employee2: "+obj2.getName()+" "+obj2.getPhoneno()+" "+obj2.getSalary()+" "+obj2.getAddress());







    }



}

