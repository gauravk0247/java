class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your_Name-Here";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class gk_42_constructors {
    public static void main(String[] args) {
        //MyMainEmployee gaurav = new MyMainEmployee("GauravKhairnar", 67);
        MyMainEmployee gaurav = new MyMainEmployee();
        //gaurav.setName("GauravPatil");
        //gaurav.setId(56);
        System.out.println(gaurav.getId());
        System.out.println(gaurav.getName());
    }
}
//Quick Quiz : Overload the Employee Constructors to initialize the salary to Rs 10,000.
