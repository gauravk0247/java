class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return  name;
    }

    public void setName(String n){
        name = n;
    }

     public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}
public class gk_40_chapter_9 {
    public static void main(String[] args) {
        MyEmployee gaurav = new MyEmployee();
        //gaurav.id = 45;
        //gaurav.name = "CodeWithGaurav"; //Throws an error due to private access modifier
        gaurav.setName("GauravPatil");
        System.out.println(gaurav.getName());
        gaurav.setId(345);
        System.out.println(gaurav.getId());
    }
}
