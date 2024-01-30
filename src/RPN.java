// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.

import java.util.Stack;

public class RPN {
    public static void main(String[] args) {
        
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
          if (token.equals("+")) {
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(num1 + num2);
          } else if (token.equals("-")) {
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(num1 - num2);
          } else if (token.equals("*")) {
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(num1 * num2);
          } else if (token.equals("/")) {
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(num1 / num2);
          } else {
            stack.push(Integer.parseInt(token));
          }
        }
        return stack.pop();
            
        }
    
}
