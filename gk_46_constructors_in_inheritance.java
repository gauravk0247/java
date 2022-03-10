class Base1{
    Base1(){
        System.out.println("I am constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as:" + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived wiht value of y as:" + y);
    }
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as:" + z);
    }
}
public class gk_46_constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(4, 7);
        ChildOfDerived cd = new ChildOfDerived(3, 5, 7);
    }
}
