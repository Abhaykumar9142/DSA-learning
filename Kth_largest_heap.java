import java.util.*;
public class Kth_largest_heap {
    public static void main(String[] args) {
        int[]arr={10,46,2,67,3,32};
        kth_largest(arr,3);

    }
    public static void kth_largest(int[]arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int i=0;
        while(i<k){
        pq.add(arr[i]);
        i++;
        }
        while(i<arr.length){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        i++;
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
