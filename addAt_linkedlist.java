import java.util.*;
public class addAt_linkedlist {
        public static class Node{
            int data;
            Node next;
            Node(int val){
                this.data=val;
            }
        }
        public static void main(String[] args) {
            Node n1=new Node(10);
            Node n2=new Node(20);
            Node n3=new Node(30);
            Node n4=new Node(40);
            Node n5=new Node(50);
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            Node head=n1;
           head=addAt(head,60,5);


            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        //Main logic
        public static Node  addAt(Node head, int val,int idx){
            if (idx == 0) {
                Node n = new Node(val);
                n.next = head;
                return n;
            }
            Node n=new Node(val);
            Node temp=head;
            for(int i=1;i<idx;i++){
                if(temp==null){
                    System.out.println("Index out of bounds");
                    return  head;
                }
                temp=temp.next;

            }
            Node tempp1=temp.next;
            temp.next=n;
            n.next=tempp1;
return head;

        }



    }

