public class gk_36_oop {
    static void foo(int a){
        System.out.println("Hello " + a + " Gaurav");
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        foo(23);
    }
}