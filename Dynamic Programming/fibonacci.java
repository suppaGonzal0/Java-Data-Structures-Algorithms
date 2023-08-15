/*
Regular solution with recursion:
  - Time Complexity: 2^n
  - Space Complexity: n

Dynamic Programming solution:
  - Time Complexity: n
  - Space Complexity: n
*/

class Fibonacci {

    public static Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if(n <= 0) return 0;

        if(n <= 2) return 1;

        if(map.containsKey(n)) return map.get(n);

        map.put(n, fib(n-1)+fib(n-2));

        return map.get(n);
    }
}
