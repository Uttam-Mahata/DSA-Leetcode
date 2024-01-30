import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {
        
    }
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public MyQueue() {
      
    }
    public void push(int x) {
      stack1.push(x);
      
      
    }
    public int pop() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.pop();
      
      
    }
    public int peek() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.peek();
      
      
    }
    public boolean empty() {
      return stack1.isEmpty() && stack2.isEmpty();
      
      
    }
    
}
