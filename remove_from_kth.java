import java.util.*;
public class remove_from_kth {
    public static void main(String[] args) {
     Queue<Integer>queue=new ArrayDeque<>();
     queue.add(10);
     queue.add(20);
     queue.add(30);
     queue.add(40);
     queue.add(50);
     queue.add(60);
     queue.add(70);
        System.out.println(queue);
        reverse(3,queue);

    }
    public static void reverse(int k,Queue <Integer> queue){
        Stack<Integer>st=new Stack<>();
        //remove from queue and add into stack
        for(int i=0;i<k;i++){
            st.push(queue.remove());

        }
        //remove from stack and add into queue
for(int i=0;i<k;i++){
    queue.offer(st.pop());
}
        int count=queue.size()-k;
//remove from front and add into back of queue
        for(int i=0;i<count;i++){
            queue.offer(queue.remove());
        }
        System.out.println(queue);


    }
}
