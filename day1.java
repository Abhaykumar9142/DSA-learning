//learning taking input from the user

// Taking number as input

//import java.util.Scanner;
//public class day1 {
//    public static void main(String[] args) {
//        System.out.println("Taking input from the user");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number");
//        int number=sc.nextInt();
//        System.out.println("your number is "+number);
//    }
//}

//Taking String as the input

//import java.util.Scanner;
//public class day1 {
//    public static void main(String[] args) {
//        System.out.println("Now we gone to take string as input");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name ");//ABHAY KUMAR
//        String name=sc.next();//here,it takes only first word of the sentence
//        System.out.println("Your name is "+name);//output ---> ABHAY
//           }
//}


import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        System.out.println("Now we gone to take string as input");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");//ABHAY KUMAR
        String name=sc.nextLine();//here,it takes full sentence
        System.out.println("Your name is "+name);//output ---> ABHAY KUMAR
    }
}