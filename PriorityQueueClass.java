import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        Queue<String> pQueue1 = new PriorityQueue<String>();

        pQueue1.offer("A");
        pQueue1.offer("E");
        pQueue1.offer("C");
        pQueue1.offer("B");
        pQueue1.offer("D");

        while(!pQueue1.isEmpty()) 
            System.out.println(pQueue1.poll());  // A, B, C, D, E

        Queue<String> pQueue2 = new PriorityQueue<String>(Collections.reverseOrder());

        pQueue2.offer("A");
        pQueue2.offer("E");
        pQueue2.offer("C");
        pQueue2.offer("B");
        pQueue2.offer("D");

        while(!pQueue2.isEmpty()) 
            System.out.println(pQueue2.poll());  // E, D, C, B, A
    }    
}
