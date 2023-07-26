import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        /*
        LinkedList is a list of nodes containing 2 parts (Data + Address)
        Nodes are linked using pointers
        Pointers point to the address of next nodes (non consecutive memory location)
                                        
                                      Singly Linked List
              Node                 Node                 Node                 Node
        [ data | address] -> [ data | address] -> [ data | address] -> [ data | address]

                                      Doubly Linked List
              Node                 Node                 Node                 Node
        [ data | address] <-> [ data | address] <-> [ data | address] <-> [ data | address]

        Functions:
            insert ---> add(object o) | push(object o) | offer(object o)
            insert first ---> addFirst(object o) | offerFirst(object o)
            insert last ---> addLast(object o) | offerLast(object o)
            insert at a specific index ---> add(index, object o)

            delete ---> remove(object o) | pop(object o) | poll(object o)
            delete first ---> removeFirst(object o) | pollFirst(object o)
            delete last ---> removeLast(object o) | pollLast(object o)

            Examine ---> getFirst() | getLast() | peek() | peekFirst() | peekLast()

            Retrive ---> get(index) | indexOf(object o)

        Advantages:
            1. Can dynamically expand
            2. Insertion and Deletion is easy O(1)
            3. Little to now memory wastage

        Disadvantages:
            1. Extra memory required for pointer
            2. No random access of elements
            3. Accessing and searching elements is more time consuming O(n)

        Some use cases:
            1. Implement stack/queues
            2. Music playlist
            3. GPS navigation

        */

        LinkedList<String> list = new LinkedList<String>();

        //LinkedList as Stack

        list.push("Demon Slayer");
        list.push("Jujitsu Kaisen");
        list.push("Tokyo Revengers");

        System.out.println(list); // [Demon Slayer] -> [Jujitsu Kaisen] -> [Tokyo Revengers]

        list.pop(); // [Tokyo Revengers]

        //LinkedList as Queue

        list.offer("Naruto");
        list.offerFirst("Fairy Tail");

        System.out.println(list); // [Fairy Tail] -> [Jujitsu Kaisen] -> [Demon Slayer] -> [Naruto]

        list.add(1, "K-ON");

        System.out.println(list); // [Fairy Tail]-> [K-ON] -> [Jujitsu Kaisen] -> [Demon Slayer] -> [Naruto]

        list.pollLast(); // [Naruto]

        list.get(0); // [Fairy Tail]

        list.indexOf("Demon Slayer"); // [Demon Slayer]
        
    }
    
}
