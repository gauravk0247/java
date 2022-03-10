class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printME(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    public int y;

    public int getY(){
        return  y;
    }

    public void setY(int y){
        this.y = y;
    }
}
public class gk_45_inheritance {
    public static void main(String[] args) {
        //Creting an objcet of base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        //Creting an objcet of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
