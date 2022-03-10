public class gk_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning Gaurav!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a, int b){ //a and b are parameter
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    static int foo(int a, int b, int c){ //a and b are parameter
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
        return 3;
    }

    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static  void tellJoke(){
        System.out.println("I invented a new!\n" + "Plagiarism");
    }
    public static void main(String[] args) {
//        tellJoke();
//        int [] marks = {52, 45, 67, 89, 56};
//        Case 1: Changing the Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is :" + x);

//        Case 1: changing the Array
//        int [] marks = {52, 56, 78, 89,90};
//        change2(marks);
//        System.out.println("The value of x after running change is: " + marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);//Arguments are actual 3000 and 4000
    }
}
