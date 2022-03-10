public class gk_27_arrays {
    public static void main(String[] args) {
//        String [] students = {"Gaurav", "Ritik", "Prasad", "Krushna","Sachin"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int [] marks = {78, 45, 67, 90, 87};
//        float [] marks = {78.45f, 45.23f, 67.4f, 90.6f, 87.5f};
//        System.out.println(marks.length);
//        Displaying the Array (Naive way)
//        System.out.println("Printing Using Naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

//        Displaying thr Array (for loop)
//        System.out.println("Printing Using for loop");
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

//        Quick Quiz : Displaying the Array in Reverse order (for loop)
        System.out.println("Printing Using for loop in Reverse Order");
        for (int i= marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

//        Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
