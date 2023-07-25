import java.util.Queue;
import java.util.LinkedList;

public class QueueClass {
    public static void main(String[] args) {
        
        /*
        FIFO: First In First Out linear data structure

        We can't instantiate the type Queue as it's an Interface
        Which extends Collections
        Linkedlist and PriorityQueue implments the Queue interface

        Functions:
            1. Enqueue --> offer(object o)
            2. Dequeue --> poll() : doesn't throw exception when empty / [element() / remove()] -> throws exception when empty
            3. peek()
            4. isEmpty()
            5. size()
            6. contains(object o) : bolean

        Some use cases:
            1. Keyboard buffer
            2. Printer queue
            3. LinkedList, Priority Queue, BFS
        */

        Queue<String> queue = new LinkedList<String>();
        
        queue.poll();   // will return []

        //queue.remove(); ---> will throw exception

        queue.isEmpty();    // True

        queue.offer("Sapiens: A Brief History of Humankind");
        queue.offer("A Really Short History of Nearly Everything");
        queue.offer("The Last Lecture");
        queue.offer("It Ends With Us");
        queue.offer("Atomic Habits");

        queue.peek();   // ---> Sapiens: A Brief History of Humankind

        queue.poll();   // ---> Sapiens: A Brief History of Humankind

        queue.peek();  // ---> A Really Short History of Nearly Everything

        queue.contains("Atomic Habits");    // ---> True

        queue.contains("It Starts With Us");    // ---> False
    }
}
