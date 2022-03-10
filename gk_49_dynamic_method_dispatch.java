class Phone{
    public void showTime(){
        System.out.println("Time is 8 Am");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
public class gk_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //SmartPhone smobj = new SmartPhone();

        Phone obj = new SmartPhone(); //Yes it is allowed
        //SmartPhone obj2 = new Phone(); //Not aloowed
//        obj.name();
        obj.showTime();
        obj.on();
        //obj.music(); //Not Allowed
    }
}
