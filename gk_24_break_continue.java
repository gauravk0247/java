public class gk_24_break_continue {
    public static void main(String[] args) {
//        for (int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loops End Here");

//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while (i<5);
//        System.out.println("Loop Ends Here");

//        Continue
//        for(int i=0;i<50;i++){
//            if (i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");

//        int i = 0;
//        while (i<50){
//            i++;
//            if (i==2) {
//                System.out.println("Emding loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }

        int i = 0;
        do {
            i++;
            if(i==2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while (i<5);
        System.out.println("Loop ends here");
    }
}
