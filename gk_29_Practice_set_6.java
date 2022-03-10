public class gk_29_Practice_set_6 {
    public static void main(String[] args) {
//        Problem - 1 - Sum of 5 Array Using Float
//        float [] marks = {67.5f, 67.2f, 78.8f, 46.4f, 90.1f};
//        float sum = 0 ;
//        for (float element: marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is " + sum);
//        System.out.println(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);

//        Problem - 2 - Write a program to find out wheather a given integer is present in an array or not.
//        float [] marks = {67.5f, 67.2f, 78.8f, 46.4f, 90.1f};
//        float num = 67.5f;
//        boolean isInArray = false;
//        for (float element: marks){
//            if (num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the Array");
//        }
//        else {
//            System.out.println("the value is not present in the Array");
//        }

//        Problem - 3 - Calculate the average marks form an array containing marks of all students in physics using for-each loop.

//        float [] marks = {67.5f, 67.2f, 78.8f, 46.4f, 90.1f};
//        float sum = 0;
//        for (float element: marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum/marks.length);

//        Problem - 4 - Create a java program to add two matrices of size 2x3
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) { //row number of times
//            for (int j = 0; j < mat1[i].length; j++) { //column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        printing The elements of a 2-D Array
//        for (int i = 0; i < mat1.length; i++) { //row number of times
//            for (int j = 0; j < mat1[i].length; j++) { //column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");
//        }

//        Problem - 5 - Write a java programs to reverse an array
//        int [] arr = {1, 2, 3, 4, 5, 23, 68};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;

//        for (int i=0;i<n;i++){
//            Swap a[i] and a[l-1-i]
//            a b temp
//            |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element: arr){
//            System.out.println(element);
//        }

//        Problem - 6 - Write a java program to find the maximum elemant in an array
//        int [] arr = {1, 34, 637, 89, 34, 4000};
//        int max = 0;
//        for (int e:arr){
//            if (e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: " + max);

//        Problem - 6 Another Way
//        int [] arr = {1, -345, 567, -8005, 2345};
//        int max = Integer.MAX_VALUE;
//        for (int e: arr){
//            if (e>max){
//                max = e;
//            }
//        }
//                System.out.println("the value of the maximum element in this array is: " + max);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        Problem - 7 - Write a java program to find the minimum element in a java array.

//        Problem - 8 - Write a java program to find wheather an array is sorted or not.
        boolean isSorted = true;
        int [] arr = {1, 2, 3, 4,5, 56, 789, 3400};
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}