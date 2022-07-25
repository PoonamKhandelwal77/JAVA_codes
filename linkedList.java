import java.lang.reflect.Constructor;

class Node{
    private int data;
    private Node next;
    private int size;
    Node(){
        this.size=0;
    }
    Node(int val){
        this.data=val;
        this.next=null;
    }
    Node(int val, Node nx){
        this.data=val;
        this.next=nx;
    }
    private Node head;
    private Node tail;
    public void insert_first(int val)
    {
        Node n1=new Node(val,head);
        head=n1;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insert_last(int val){
        Node n1=new Node(val);
        if(tail==null){
            tail=head=n1;
        }else{
            tail.next=n1;
            tail=n1;
        }
        size++;
    }
    public void insert_pos(int val,int pos){
        int i=1;
        Node temp=head;
        if(pos==1){
            insert_first(val);
        }else if(pos==size){
            insert_last(val);
        }
        else {
            while (i!= pos-1) {
                temp=temp.next;
                i++;
            }
            Node n1=new Node(val,temp.next);
            temp.next=n1;
            size++;
        }
       
       
    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("end and size ="+ size);
    }

    public void delete_first(){
        if(head==null){
            return;
        }
        else{
            head=head.next;
        }
        size--;
    }

    public void delete_last(){
        Node temp=head;
        if(head==null){
            return;
        }else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            tail=temp;
            tail.next=null;
            size--;
        }
    }

    public void delete_pos(int pos){
       int i=1;
        if(head==null){
            return;
        }
        else{
            Node temp=head,pre=head;
            while(i!=pos){
                pre=temp;
                temp=temp.next;
                i++;
            }
            pre.next=temp.next;
            size--;
        }
    }
}
public class linkedList {
    public static void main(String[] args) {
        Node n1=new Node();
        n1.insert_first(10);
        n1.insert_first(20);
        n1.display();
        n1.insert_last(30);
        n1.insert_last(40);
        n1.display();
       n1.insert_pos(50,1);
       n1.insert_pos(60, 6);
       n1.display();
       n1.delete_first();
       n1.display();
       n1.delete_last();
       n1.display();
       n1.delete_pos(2);
       n1.display();
    }
    
}
