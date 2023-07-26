import java.util.Hashtable;

public class HashTableClass {

    /*
     * Entry<K,V> a data structure that holds key value pairs
     * 
     * HashMap: allows one null key and mutiple null values
     * Hashtable: does not allow any null key or values
     * 
     * put ---> key.hashCode() % capacity
     * When two keys result in same value for key.hashCode() % capacity it is called a collision
     * Collision is handled by chaining elements using a LinkedList
     * 
     * Hashtable<K,V> table = new Hashtable<K,V>(capacity, load factor)
     * Capacity is by default 11 but we can pass any integer value
     * Load factor is by default 0.75f defining that the hashtable will dynamically expand when it is 75% full
    */

    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<Integer,String>();

        table.put(0, "A");
        table.putIfAbsent(1, "B");
        table.remove(1);
        System.out.println(table); //{0=A}

        table.put(2, "C");
        System.out.println(table); //{2=C, 0=A}
        table.put(3, "D");

        for(Integer key: table.keySet()){
            System.out.println(key+" :"+table.get(key));
        }

        for(String val: table.values()){
            System.out.println(val);
        }

        table.clear();
        System.out.println(table); //{}
    }
}
