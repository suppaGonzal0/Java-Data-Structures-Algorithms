import java.util.Stack;

public class StackClass{
    public static void main(String [] args){
        
        /*
        LIFO: Last In First Out linear data struture

        Some use cases:
            1. undo/redo feature
            2. moving back/forward in browers
            3. backtracking algorithms

        Functions:
            1. push(object o)
            2. pop()
            3. peek()
            4. empty()
            5. search(Object o) : position
            6. size()
        */

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.size());   // ---> 0

        System.out.println(stack.empty());  // ---> True

        stack.push("Red Dead Redemption II");
        stack.push("Uncharted 4: A Thief's End");
        stack.push("Mafia");
        stack.push("Valorant");
        stack.push("Amnesia");

        System.out.println(stack.size());   // ---> 5

        System.out.println(stack.empty());  // ---> False

        stack.peek();   // ---> Red Dead Redemption II

        System.out.println(stack);  // ---> [Red Dead Redemption II, Uncharted 4: A Thief's End, Mafia, Valorant, Amnesia]

        stack.search("Amnesia");    // ---> 1

        stack.pop();    // ---> Red Dead Redemption II

        System.out.println(stack);  // ---> [Red Dead Redemption II, Uncharted 4: A Thief's End, Mafia, Valorant]

        stack.search("Valorant");    // ---> 1

        stack.search("Amnesia");    // ---> -1
    }
}