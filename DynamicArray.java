public class DynamicArray{

    int size = 0;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public void add(Object o){
        if(size >= capacity) grow();
        array[size] = o;
        size++;
    }

    public void insert(int index, Object o){
        if(size >= capacity) grow();

        for(int i=size; i>index; i--) array[i] = array[i-1];

        array[index] = o;
        size++;
    }

    public int search(Object o){
        for(int i=0; i<size; i++){
            if(array[i] == o) return i;
        }
        return -1;
    }

    public Object get(int index){
        if(index >= size) return null;
        return array[index];
    }


    public void grow(){
        Object[] newArray = new Object[capacity*2];
        capacity *= 2;

        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public void shrink(){
        Object[] newArray = new Object[capacity/2];
        capacity /= 2;

        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public int remove(Object o){
        for(int i=0; i<size; i++){
            if(array[i] == o){
                for(int j=i; j<size-1; j++){
                    array[j] = array[j+1];
                }
                array[size-1] = null;
                if(--size <= (int)capacity/3) shrink();
                return i;
            }
        }

        return -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String str = "";

        if(size>0){
            for(int i = 0; i<size-1; i++) str += array[i] + ", ";
            str += array[size-1];
        }

        str = "[" + str + "]";

        return str;
    }

    public static void main(String[] args) {

        /*
         * ArrayList ---> Dynamic Arrays with resizable capacity
         *                When size == capacity : capacity * 2
         * 
         * Disadvantages:
         *  1. Memory wastage
         *  2. Shifting elements is time consuming O(n)
         *  3. Expanding/Shrinking array is time consuming O(n)
         * 
         * ArrayList<String> list = new ArrayList<String>();
        */

        DynamicArray arr = new DynamicArray();

        System.out.println(arr.toString());
        arr.add("A");
        arr.add("B");
        arr.insert(1, "C");
        System.out.println(arr.search("C"));
        arr.remove("C");
        System.out.println(arr.toString());
        System.out.println(arr.get(1));
    }
}