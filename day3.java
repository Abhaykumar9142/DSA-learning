import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        /*(i) While loop
         * while(boolean condition){
         * //statement}
         * if the condition never become false,the while loop keeps getting executed .Such a loop is known as infinite loop
         *
         * (ii)Do while loop
         *
         * do{//code}
         * while(condition);
         *
         * Difference between DO while and while loop
         * while->check the condition and execute the code
         * Do while -> Execute the code and check the condition
         *
         * (iii)For loop
         * for (initialize;check for condition;update){
         * //code;}
         *
         * Break Statement
         * the Break statement is used to exit the loop irrespective of whether the condition is true or false
         * Whenever a 'break' is encountered inside the loop,the control is sent outside the loop.
         * It completely exists the loop.
         *
         * Continue Statement
         * THe continue statement is used to immediately move to next iteration  of the loop.
         * The control is taken to the next iteration.Thus,skipping everything below 'continue'inside the looop for that iteration.
         * It skips the particular iteration of the loop.
         *
         *
         *
         * */

        // Write a program to print natural number from 100 to 200
//        int i=100;
//        while (i<=200){
//            System.out.println(i);
//        i++;}

        /* Write a program to print the following pattern
         *                     ****
         *                     ***
         *                     **
         *                     *

         */
//int i=4;
//while(i>0){
//    int j=0;
//    while(j<i){ System.out.print("*");
//        j++;
//    }
//i--;
//    System.out.println(" ");

//factorial of a number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        int n= sc.nextInt();
//        int i=1;
//        int factorial=1;
//        while(n>=i){
//            factorial*=i;
//            i++;
//        }
//        System.out.println("Factorial of n = "+factorial);


// print number from 1 to 20
//        for(int i=1;i<=20;i++){
//            System.out.println(i);
//        }

        //print all even number between 1 to 50
//        for(int i=1;i<=50;i++){
//          if(i%2==0){
//              System.out.println(i);
//          }
//        }

        //print the sum of number from 1 to 100
//    int sum=0;
//    for(int i=1;i<=100;i++){
//        sum+=i;
//    }
//        System.out.println(sum);
//

        //Print multiplication table of any number
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number= ");
//        int n= sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(n+"X"+i+"="+n*i);
//        ;}

//Count digit in a number
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        String num=sc.next();
//        int count=num.length();
//        System.out.println("number of digit is "+count);
//        int temp=num;
//        if(temp==0){
//            count=1;
//         }else if(temp<0){
//            temp=-temp;
//        }
//       while (temp>0){
//           temp=temp/10;
//           count++;
//           }

        // We do not use upper method because int and long have certain range instead of it we convert into string


//        Reverse of a number
//   method 1:Using loop
//                ( Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        long num=sc.nextLong();
//        long rev=0;
//        long temp=num;
//        while (temp>0){
//            long digit =temp%10;//removing the last digit
//                  rev=rev*10+digit;
//                temp=temp/10;
//        }
//        System.out.println("Reverse of the above number is "+rev);
//)

//        Method 2:Using String
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        String num=sc.next();
//        String rev="";
//        for (int i=num.length()-1;i>=0;i--){
//            rev=rev+num.charAt(i);
//
//        }
//        System.out.println("Reverse of the above number is "+rev);


        //Palindrome number like 121, 123654456321;
//    Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        long num=sc.nextLong();
//        long rev=0;
//        long temp=num;
//        while(temp>0){
//            long digit=temp%10;//removing the last digit
//            rev=rev*10+digit;
//            temp=temp/10;
//        }
//        System.out.println("Reversal of the above number= 45"+rev);
//        if(temp==rev){
//            System.out.println("The above number is a palindrome number");
//        }else{
//            System.out.println("the above is not a palindrome number");
//        }


        //Fibbonacci Series
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number = ");
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print(a+" "+b+" ");
//        for (int i = 3; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print(c+" ");   }
//
//        Sum of all odd numbers from 1 to 100
//        int sum=0;
//        for(int i=1;i<=100;i++){
//            if (i%2!=0){
//                sum+=i;
//                System.out.println(i);
//            }
//        }
//        System.out.println("sum of the numbers = "+sum);
//
//        Print a 4×4 Square Pattern
//                ****
//                ****
//                ****
//                ****

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <=4 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        Print Right-Angle Triangle Pattern
//        *
//        **
//        ***
//        ****
//        *****

//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println(); }
//
//        QUESTION 13: Print Inverted Triangle Pattern
//  *****
//  ****
//  ***
//  **
//  *

//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        QUESTION 14: Print Number Triangle Pattern
//        1
//        12
//        123
//        1234
//        1235

//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();}

        //      QUESTION 15: Print Number Triangle Pattern
//        1
//        22
//        333
//        4444
//        55555

//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //QUESTION 16: Pyramid Pattern
//            *
//           ***
//          *****
//         *******
//        *********

//        for(int i=1;i<=5;i++){
//            //Space printing
//            for(int space=5-i;space>0;space--){
//                System.out.print(" ");
//            }
//
//            //Star printing
//            for (int star=1;star<=(2*i-1);star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // QUESTION 17: Inverted Pyramid
//    *********
//     *******
//      *****
//       ***
//        *

//        for(int i=5;i>0;i--){
//            //Space printing
//            for(int space=5-i;space>0;space--){
//                System.out.print(" ");
//            }
//
//            //Star printing
//            for (int star=1;star<=(2*i-1);star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        QUESTION 18: Print Floyd’s Triangle
//            1
//            2 3
//            4 5 6
//            7 8 9 10
//    int num=1;
//        for(int i=1;i<=4;i++){
//        for (int j=1;j<=i;j++){
//            System.out.print(num+"");
//        num++;}
//            System.out.println();}


//        QUESTION 19: Hollow Square Pattern
//*****
//*   *
//*   *
//*****

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (i == 1 || i == 4 || j == 1 || j == 4) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        QUESTION 20: Print Checkerboard Pattern
//* * * *
// * * * *
//* * * *
// * * * *

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();       }
    }
}

