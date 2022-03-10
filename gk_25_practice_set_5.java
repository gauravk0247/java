import java.util.Scanner;

public class gk_25_practice_set_5 {
    public static void main(String[] args) {
//        Practice Proble - 1 - Printing Star Pattern
//        int n = 4;
//        for (int i=n;i>0;i--) {
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Problem - 2 - Addition of even number
//        int sum =0;
//        int n=4;
//        for (int i=0;i<n;i++) {
//            sum = sum + (2 * i);
//        }
//            System.out.println("Sum of enevn number is: ");
//        System.out.println(sum);
//        First 4 even number is = 0 2 4 8=12

//        Problem - 3 - Multiplication Table
//        int n;
//        System.out.println("Enter a Multiplication Table Number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
////        int n = 5;
////        for (int i=0; i<10; i++) - Goes from i=0 to i=9
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d x  %d = %d\n", n, i, n*i);
//        }

//        Problem - 4 - Multiplication Table reverse order
//        int n;
//        System.out.println("Enter a Multiplication Table Number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=10; i>=1; i--){
//                        System.out.printf("%d x  %d = %d\n", n, i, n*i);
//        }

//        Problem - 5 - Find Factorial of given number

//        Problem - 6 - repeat using while loop
//        int n;
//        System.out.println("Enter a Number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        What is factorial n = n * n-1 * n-2 ... 1
//        5! = 5*4*3*2*1
//        int i = 1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

//        Problem - 7 - Using 1 Question Changes are required
//        for (int i=n;i>0;i--) {
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Problem - 8 -True Any loop use for all Problems

//        Problem - 9 - Sum of 8 Number Table
//        int n;
//        int sum = 0;
//        System.out.println("Enter a Table Number: ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=1;i<=10;i++){
//            sum +=n*i;
//        }
//        System.out.println(sum);

//        Problem 10 - at least one time executed while loop

//        Problem - 11 Using For Loop
        int sum =0;
        int n=5;
        int i=0;
        while (i<n){
            sum = sum + (2 * i);
//            System.out.println("Sum of even number is :");
            System.out.println(sum);
            i++;
        }
//        for (int i=0;i<n;i++) {
//            sum = sum + (2 * i);
//        }
//            System.out.println("Sum of even number is: ");
//        System.out.println(sum);
//        First 4 even number is = 0 2 4 8=12
    }
}
