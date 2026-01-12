import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue_Intro {
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque<>();

        //Add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

        System.out.println(queue.peek());
        //removal of element
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        //size
        System.out.println(queue.size() );

    //Linkedlist implementation using queue------> queue follow First In,First out

        LinkedList<Integer>que=new LinkedList<>();
        que.addLast(100);
        que.addLast(90);
        que.addLast(80);
        que.addLast(70);
        que.addLast(60);
        que.addLast(50);

        System.out.println(que.removeFirst());
        System.out.println(que.size());
        System.out.println(que.removeFirst());
        System.out.println(que.size());


    }
}
