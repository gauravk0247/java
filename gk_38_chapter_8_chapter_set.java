import java.util.Scanner;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return  salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }

    public void callFriend(){
        System.out.println("Calling Gaurav.....");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class gk_38_chapter_8_chapter_set {
    public static void main(String[] args) {
        //Problem 1
        /*Employee1 gaurav = new Employee1();
        gaurav.setName("CodeWithGaurav");
        gaurav.salary=45;
        System.out.println(gaurav.getSalary());
        System.out.println(gaurav.getName());
         */

        //Problem - 2
        /*CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();*/

        //Problem - 3
        /*Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         */

        //Problem - 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
