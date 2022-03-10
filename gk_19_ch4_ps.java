import java.util.Scanner;

public class gk_19_ch4_ps {
    public static void main(String[] args) {
//        Question - 1
//        int a = 11;
//        if (a = 10){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

//        Question - 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Physics Marks");
//        m1 = sc.nextByte();
//
//        System.out.println("Ener Your Chemistry Marks");
//        m2 = sc.nextByte();
//
//        System.out.println("Ener Your Mathematics Marks");
//        m3 = sc.nextByte();
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m3>=33){
//            System.out.println("Congratulations, You have been prompted");
//        }
//        else {
//            System.out.println("Sorry, You have not been promoted! Please try again");
//        }

//        Question -3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Income in Lakhs per annum");
//        float tax =0;
//        float income = sc.nextFloat();
//        if(income<=2.5f){
//            tax = tax + 0;
//        }
//        else  if(income>2.5f && income<=5f){
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if(income>5f && income<=10f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (income-5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f-5f);
//            tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println("The total tax is paid by the employee is: " + tax);

//        Question - 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

//        Question - 5
        int year;
        System.out.println("Enter an year:: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year % 4 == 0) && (year % 100!= 0) || (year%400 == 0)){
            System.out.println("Year is leap Year");
        }
        else {
            System.out.println("This Year is not a leap year");
        }

//        Question - 6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an Organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is an Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
    }
}
