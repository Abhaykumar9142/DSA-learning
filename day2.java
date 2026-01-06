//Arithmetic operations:-

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int sum=a+b;
//        int difference=b-a;
//        int product=a*b;
//        int square_formula=(a*a+b*b+2*a*b);
//        double square=(Math.pow(a,2))+(Math.pow(b,2))+(2*a*b);
//        System.out.println("sum of a and b = "+sum);
//        System.out.println("difference between a and b = "+difference);
//        System.out.println("product of a and b = "+product);
//        System.out.println("square of addition of a and b = "+square_formula);
//        System.out.println("square = "+square);

//method to find the root of quadratic equation
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of a = ");
//        double a=sc.nextDouble();
//        System.out.println("Enter the value of b = ");
//        double b=sc.nextDouble();
//        System.out.println("Enter the value of c = ");
//        double c=sc.nextDouble();
//        double D=(b*b-4*a*c);
//        if(D>=0) {
//            System.out.println("the value of D = " + D);
//            double root_1 = (-b + Math.sqrt(D)) / (2 * a);
//            double root_2 = (-b - Math.sqrt(D)) / (2 * a);
//            System.out.println("Root of this equation =" + root_1 + " & " + root_2);
//        }
//        else{
//            System.out.println("no real root exists");
//
//        }

        //write a program to calculate Simple interest

//      Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the value of P = ");
//        float P=sc.nextFloat();
//
//        System.out.println("Enter the value of R = ");
//        float R=sc.nextFloat();
//
//        System.out.println("Enter the value of T = ");
//        float T=sc.nextFloat();
//
//        float SI=(P*R*T)/100;
//        System.out.println("value of SI = "+SI);
//
//sc.close();

        //Checking for even or odd

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num=sc.nextInt();
//        if(num%2==0){
//            System.out.println(num+" is an even number");
//        }else {
//            System.out.println(num+" is an odd number");
//        }
//        sc.close();


        //Grade Calculator
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your marks");
//        int marks = sc.nextInt();
//        if(marks<0 || marks>100){
//            System.out.println("invalid marks !!");
//        }
//        else if (marks>=90 ){
//            System.out.println("Grade A+");
//        }
//        else if (marks>=80) {
//            System.out.println("Grade A");
//                    }
//       else if(marks >=70 ){
//            System.out.println("Grade B+");
//    } else if (marks >=60 ) {
//            System.out.println("Grade B");
//
//            }
//       else{
//            System.out.println("Fail");
//        }
//       sc.close();


        //simple calculator using switch case
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number = ");
//        float num1 = sc.nextFloat();
//
//        System.out.println("Enter your second  number = ");
//        float num2 = sc.nextFloat();

//        System.out.println("Enter your Operation (+,-,*,/)");
//        String op=sc.next();
//
//        switch (op){
//            case "+":
//                System.out.println(num1+num2);
//        break;
//            case "-":
//                System.out.println(num1-num2);
//            break;
//            case "*":
//                System.out.println(num1*num2);
//            break;
//                case "/":
//                    if(num2==0){
//                        System.out.println("Number is not divisible by 0");
//                    }else {
//                System.out.println(num1/num2);
//                        }
//        break;
//        }
//
//

        //Checking for Leap year
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the year = ");
//        int year=sc.nextInt();
//        if(year%4==0 && (year%100 !=0||year%400==0) ){
//            System.out.println(year+ " is a leap year");
//        }else {
//            System.out.println(year + " is not a leap year");
//        }
//   sc.close();

    //Type casting

//        int a=25;
//        System.out.println("a = "+a);
//        double b=a;
//        System.out.println("b = "+b);

//double a=12.75;
//        System.out.println("a = "+a);
//int b=(int)a;
//        System.out.println("b = "+b);

        int x=260;
        System.out.println("x = "+x);
        byte b=(byte) x;
        System.out.println("b = "+b);

    }
}