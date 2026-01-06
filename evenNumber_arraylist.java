
//import java.util.ArrayList;
//
//public class array_list_scaler {
//    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        //add
//        list.add(5);
//        list.add(10);
//        list.add(4);
//        list.add(15);
//        list.add(8);
//        list.add(21);
//        list.add(3);
//        list.add(2);
//
//        for(int i= list.size()-1;i>=0;i--){
//            if(list.get(i)%2==0){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//    }
//}
//Remove prime number using arraylist



import java.util.ArrayList;
import java.util.Scanner;

public class evenNumber_arraylist {
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number : ");
//        int n=sc.nextInt();
//        if(isPrime(n)){
//            System.out.println("given number is a prime");
//        }else{
//            System.out.println("given number is not a prime");
//        }
//}

  public  void removePrime(int[]A){
      ArrayList<Integer>list=new ArrayList<>();
      for(int i=0;i<A.length;i++){
          if(!isPrime(A[i])){
              list.add(A[i]);
          }
      }
      System.out.println("Array after removing prime number:"+list);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array,S=");
        int S=sc.nextInt();
        int [] arr=new int[S];
        System.out.println("Enter your Array");
        for (int i=0;i<S;i++){
            arr[i]=sc.nextInt();
        }
evenNumber_arraylist result=new evenNumber_arraylist();

        result.removePrime(arr);

    }
}