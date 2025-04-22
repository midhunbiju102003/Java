
public class StackDemo { 
    public static void main(String args[]) { 
        java.util.Stack<Integer> stk = new java.util.Stack<Integer>(); 

        stk.push(10); 
        stk.push(15); 
        stk.push(30); 
        stk.push(20); 
        stk.push(5); 

        System.out.println("Initial Stack: " + stk); 

        System.out.println("The element at the top of the stack is: " + stk.peek()); 

        System.out.println("Popped element: " + stk.pop()); 
        System.out.println("Popped element: " + stk.pop()); 

        System.out.println("Stack after pop operation: " + stk); 
        System.out.println("The element at the top of the stack is: " + stk.peek()); 
    } 
}

// Initial Stack: [10, 15, 30, 20, 5]
// The element at the top of the stack is: 5
// Popped element: 5
// Popped element: 20
// Stack after pop operation: [10, 15, 30]
// The element at the top of the stack is: 30