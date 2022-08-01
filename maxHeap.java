
public class maxHeap {
    private int size;
    private int maxsize;
    private int[] heap;
// constructor to initialize the heap
    public maxHeap(int size) {
        this.maxsize = size;
        this.size = 0;
        heap = new int[this.maxsize];
    }
// method-1 return the parent position
    private int parent(int pos) {
        return (pos - 1) / 2;
    }
// method 2 returns the position of left child
    private int leftCh(int pos) {
        return 2 * pos + 1;
    }
// method 3 returns the position of right child
    private int rightCh(int pos) {
        return 2 * pos + 2;
    }
// method 4 returns that position is of leaf node or not
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }

        return false;
    }
// method 5 for swapping the elements
    private void swap(int p, int q) {
        int temp = heap[p];
        heap[p] = heap[q];
        heap[q] = temp;
    }
// method 6 for converting the tree into heap tree
    private void maxheapify(int pos) {
        if (isLeaf(pos))
            return;

        if (heap[pos] < heap[leftCh(pos)] || heap[pos] < heap[rightCh(pos)]) {
            if (heap[leftCh(pos)] > heap[rightCh(pos)]) {
                swap(pos, leftCh(pos));
                maxheapify(leftCh(pos));
            } else {
                swap(pos, rightCh(pos));
                maxheapify(rightCh(pos));
            }
        }

    }
// method 6 for inserting an element in heap tree
    public void insert(int element){
        heap[size]=element;
        int current = size;
        while (heap[current]>heap[parent(current)]) {
            swap(current, parent(current));
            current=parent(current);
        }
        size++;
    }
// method 7 to print the heap tree
    public void print(){
        int i;
        for(i=0;i<size/2;i++){
            System.out.println("parent node :"+heap[i]);
            if(leftCh(i)<size){
                System.out.println("left child : "+heap[leftCh(i)]);
            }
            if(rightCh(i)<size){
                System.out.println("right child : "+heap[rightCh(i)]);
            }
            System.out.println();
        }
    }
// method 8 to print the extract the top most element
    public int extract(){
        int popped = heap[0];
        heap[0]=heap[--size];
        maxheapify(0);
        return popped;
    }

    //main method
    public static void main(String[] args) {
        maxHeap mx=new maxHeap(10);
        mx.insert(10);
        mx.insert(20);
        mx.insert(30);
        mx.insert(40);
        mx.insert(2);
        mx.insert(45);
        mx.insert(90);
        mx.insert(46);
        mx.print();

        System.out.println("max value is : "+mx.extract());
        System.out.println("max value is : "+mx.extract());
    }
}
