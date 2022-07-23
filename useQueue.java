import java.util.*;
public class useQueue {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println(q1);
        q1.remove();
        q1.remove();
        q1.add(45);
        System.out.println(q1);
    }
}
