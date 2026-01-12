import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class intro_to_heap {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(70);
        pq.add(50);
        pq.add(48);
        pq.add(47);
        System.out.println(pq);
pq.remove();
        System.out.println("heap after removal : "+pq);
        System.out.println(pq.peek());
        System.out.println("size of the heap "+pq.size());

        PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(50);
        pq1.add(40);
        pq1.add(20);
        pq1.add(46);
        pq1.add(56);
        System.out.println(pq1);
        pq1.remove();
        System.out.println("after removal of element "+pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());


    }
}
