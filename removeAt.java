public class removeAt {
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
        Node n6=new Node(60);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node head=n1;
        head=removeAt(head,5);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node removeAt(Node head,int idx){
        if(head==null){
            return null;
        }
        if(idx==0){
            head=head.next;
        }
Node temp=head;
        for(int i=1;i<idx;i++){
            if(temp.next==null){
                return head;
            }
            temp=temp.next;
        }
Node temp1=temp.next.next;
        temp.next=temp1;
        return head;
    }
}

