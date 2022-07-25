class Node {
    int data;
    Node next;
    Node prev;
    int size;

    private Node head;
    private Node tail;

    Node() {
        size = 0;
    }

    Node(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }

    Node(int val, Node nx) {
        this.data = val;
        this.next = nx;
        this.prev = null;
    }

    Node(int val, Node nx, Node prev) {
        this.data = val;
        this.next = nx;
        this.prev = prev;
    }

    public void insert_first(int val) {

        if (tail == null && head == null) {
            Node n1 = new Node(val);
            head = tail = n1;
        } else {
            Node n1 = new Node(val, head);
            head.prev = n1;
            head = n1;
        }
        size++;
    }

    public void insert_last(int val) {
        if (head == null) {
            Node n1 = new Node(val);
            head = tail = n1;
        } else {
            Node n1 = new Node(val, null, tail);
            tail.next = n1;
            tail = n1;
        }
        size++;
    }

    public void insert_pos(int val, int pos) {
        if (head == null) {
            insert_first(val);
        } else if (pos - 1 == size) {
            insert_last(val);
        } else {
            int i = 1;
            Node temp = head;
            while (i != pos - 1) {
                temp = temp.next;
                i++;
            }
            Node n1 = new Node(val, temp.next, temp);
            temp.next = n1;
            temp.next.prev = n1;
            size++;
        }
        
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("end and the size = " + size + " tail = " + tail.data);
        }

    }

    public void delete_first(){
        if(head==null){
            return;
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
        
    }
     public void delete_last(){
        if(head==null){
            return;
        }else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
        
     }
     public void delete_pos(int pos){
        if(head==null){
            return;
        }else if(pos==1){
            delete_first();
        }
        else if(pos==size){
            delete_last();
        }
        else{
            int i = 1;
            Node temp = head;
            while (i != pos) {
                temp = temp.next;
                i++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
        
     }
}

public class doublyLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.insert_first(10);
        n1.insert_first(20);
        n1.display();
        n1.insert_last(30);
        n1.insert_last(40);
        n1.display();
        n1.insert_pos(100, 5);
        n1.display();
        n1.delete_first();
        n1.display();
        n1.delete_last();
        n1.display();
        n1.delete_pos(2);
        n1.display();
    }
}
