class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class gk_37_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee gaurav = new Employee(); //Instantiating a new Employee Object
        Employee prasad = new Employee(); //Instantiating a new Employee Object
        //Setting Attributes for Gaurav
        gaurav.id = 12;
        gaurav.salary = 3400000;
        gaurav.name = "CodeWithGaurav";

        //Setting Attributes for Prasad
        prasad.id = 23;
        prasad.salary = 4500000;
        prasad.name = "HingePrasad";

        //Printing the Attributes
        gaurav.printDetails();
        prasad.printDetails();
        int salary = prasad.getSalary();
        System.out.println(salary);
        //System.out.println(gaurav.id);
        //System.out.println(gaurav.name);
    }
}
