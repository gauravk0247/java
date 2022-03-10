import org.w3c.dom.css.Rect;

import java.awt.*;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI* radius * radius *height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class gk_44_ps4 {
    public static void main(String[] args) {
        //Problem - 1
       /* Cylinder myCylinder = new Cylinder(9,12);
        //myCylinder.setHeight(12);
        //int h = myCylinder.getHeight();
        System.out.println(myCylinder.getHeight());
       // myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        //Problem - 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        */

        //Problem - 4
        Rectangle r = new Rectangle(12, 67);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
