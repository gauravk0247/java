import java.util.Scanner;

public class gk_13_ch3_strings {
    public static void main(String[] args) {
//        String name;
//        name = "Gaurav";
//        System.out.println(name);

//        String name = new String("Gaurav");
//        String name = "Gaurav";
//        System.out.print("The Student Name is ");
//        System.out.println(name);

        int a = 45;
        float b = 67.8f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The valuf of a is %d and value of b is %.4f", a, b);

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
