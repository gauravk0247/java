import java.util.Scanner;

public class gk_11_cbse_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Chemistry Marks");
        float mark1 = sc.nextFloat();
        System.out.println("Enter Your Physics Marks");
        float mark2 = sc.nextFloat();
        System.out.println("Enter Your Biology Marks");
        float mark3 = sc.nextFloat();
        System.out.println("Enter Your Mathematics Marks");
        float mark4 = sc.nextFloat();
        System.out.println("Enter Your English Marks");
        float mark5 = sc.nextFloat();
        System.out.println((mark1 + mark2 + mark3 + mark4 + mark5)/500*100 + " Percent");
        System.out.println("Made By Gaurav!!!");

    }
}
