import java.util.Scanner;

public class day4_array {
    public static void main(String[] args) {
        //array as in input

//        Scanner sc=new Scanner(System.in);
//        int []array=new int[5];
//        System.out.println("Enter 5 numbers = ");
//        //input
//        for (int i=0;i<array.length;i++){
//            array[i]= sc.nextInt();
//
//        }
//        for(int i=0;i< array.length;i++){
//            System.out.println(array[i]);
//        }


//Sum of the elements
//int sum=0;
//int[]arr=new int[5];
//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number");
//        for (int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//
//
//for (int i=0;i< arr.length;i++){
//    sum+=arr[i];
//
//}
//        System.out.println("sum of the element = "+sum);
//

//        int[]arr=new int[5];
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your number = ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        int min=arr[0];
//        for (int i=0;i<arr.length;i++){
//
//            if (arr[i]<min) {
//                min=arr[i];
//
//            }
//
//        }
//
//        System.out.println("maximum value = "+min);
//

        //Print array in reverse order
//        int[]arr=new int[5];
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your number = ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println("reverse order =");
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]+"");
//        }

//        int[]arr=new int[5];
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your number = ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                count+=1;
//            }
//        }
//        System.out.println("Number of even element ="+count);
//        System.out.println("Number of odd element = "+(arr.length-count));

        //Linear Search

//        int arr[]={10,25,35,51,45};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        int search=sc.nextInt();
//
//        boolean found=false;
//        for(int i=0;i<arr.length;i++){
//
//            if(arr[i]==search){
//                found=true;
//                System.out.println("find the match !!");
//                break;
//
//            }
//
//        }
//if(!found){
//    System.out.println("not found");
//}
//        int arr_A[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number = ");
//        for(int i=0;i<arr_A.length;i++){
//        arr_A[i]=sc.nextInt();
//        }
//
//        int[]arr_B=new int[5];
//        for (int i=0;i< arr_A.length;i++){
//            arr_B[i]=arr_A[i];
//        }
//
//for (int i=0;i<arr_B.length;i++){
//    System.out.println(arr_B[i]);
//}


        //MERGING OF TWO ARRAAY
        int[]A={10,20,30};
        int[]B={40,50,60};
        int[]C=new int[A.length+B.length];
        for (int i=0;i<A.length;i++){
            C[i]=A[i];
        }
        for (int i=0;i<B.length;i++){
            C[A.length+i]=B[i];

        }
   for (int i=0;i<C.length;i++){
       System.out.println(C[i]);}
    }
}

