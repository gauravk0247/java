public class gk_35_pratice_set_on_method {
//    p-1
//    static void multiplication(int n){
//        for (int i=1;i<=10;i++){
//            System.out.format("%d x %d = %d\n",n, i, n*i );
//        }
//    }

//    p-2
//    static void pattern(int n){
//        for (int i=0;i<n;i++){
//            for (int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    p-3
//    sum(n) = 1 + 2 + 3 ...+ n
//    sum(n) = 1 + 2 + 3 ...+ n-1 + n
//    sum(n) =sum(n-1) + n
//    sum(3) =sum(2)
//    sum(3) =3 + 2 + sum(1)
//    sum(3) =3 + 2 + 1
//    static int sumRec(int n){
////        Base condition
//        if (n==1){
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }

//    p-4
//static void patternrev(int n){
//        for (int i=n-1;i>=0;i--){
//            for (int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    p-5
//    static  int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }

//    p-8
static void pattern_rec(int n) {

    if (n > 0) {
        pattern_rec(n - 1);
        for (int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//pattern_rec(3)
//pattern_rec(2) + 3 times star and new line
//pattern_rec(1) + 2 times star and new line + 3 times star and new line
//pattern_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    public static void main(String[] args) {
        //Problem 1 - Write a Java method to print multiplication table of a number n.
//        multiplication(7);

        //Problem 2 - Write a program using functions to print the following pattern:
//        *
//        **
//        ***
//        ****
//        pattern(9);

        //Problem 3 - Write a recursive function to calculate sum of first n natural numbers.
//        int c = sumRec(4);
//        System.out.println(c);

        //Problem 4 - Write a function to print the following pattern
//        ****
//        ***
//        **
//        *
//        patternrev(5);

//        Problem - 5 - Write a function to print nth term of fibonacci series using recursion.
        //fibonacci series - 0, 1,1 ,2 ,3, 5, 8, 13,21, 34
//        int result = fib(9);
//        System.out.println(result);

//        Problem - 6 - Write a function to find average of a set of numbers passed as arguments

//        Problem - 8 - Repeat 2 using recursion
        pattern_rec(5);
    }
}
