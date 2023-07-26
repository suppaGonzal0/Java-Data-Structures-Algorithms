public class BinarySearch {

    public static int search(int[] arr, int target){
        int low = 0, high = arr.length-1, middle = 0, value = 0; 

        while(low<high){
            middle = (high+low)/2;
            value = arr[middle];

            if(value == target) return middle;
            else if(value > target) low = middle + 1;
            else high = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6}, 3));
        System.out.println(search(new int[]{1,2,3,4,5,6}, 7));
    }
}
