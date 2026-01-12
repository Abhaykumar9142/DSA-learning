import java.util.*;
public class stack_intro {
    public static void main(String[] args) {
//Stack<Integer>stack=new Stack<>();

//Add
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);

        //peek
//        System.out.println(stack.peek());
//
        //remove  pop()---->return the element which is removed
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//size
//        System.out.println(stack.size());

        LinkedList<Integer>stack=new LinkedList<>();
        //add First and remove First
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);
        stack.addFirst(50);

        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.size());
    }
}
