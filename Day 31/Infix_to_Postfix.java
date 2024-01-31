public class Infix_to_Postfix {
    class Solution {
        // Function to convert an infix expression to a postfix expression.
        public static String infixToPostfix(String exp) {
            // Your code here
            StringBuilder postfix = new StringBuilder();
    
            Stack<Character> op = new Stack<>();
    
            int i = 0;
            while (i < exp.length()) {
                //add Operand
                if (!isOperator(exp.charAt(i))) {
                    postfix.append(exp.charAt(i));
                    i++;
                } else {
                    if (op.empty() || exp.charAt(i) == '(') {
                        op.push(exp.charAt(i));
                        i++;
                        continue;
                    }
                    
                    if (exp.charAt(i) == ')') {
                        while (op.peek() != '(')
                            postfix.append(op.pop());
                        op.pop();
                        i++;
                        continue;
                    }
                    
                    if (priority(exp.charAt(i)) > priority(op.peek())) {
                        op.push(exp.charAt(i));
                        i++;
                        continue;
                    }
                    
                    if (priority(exp.charAt(i)) <= priority(op.peek())) {
                        // both are '^' case
                        if (exp.charAt(i) == '^' && op.peek() == '^') {
                            postfix.append(op.pop());
                            op.push(exp.charAt(i));
                            i++;
                            continue;
                        }
                      
                        while (!op.empty() && op.peek() != '(') {
                            postfix.append(op.pop());
                        }
                        op.push(exp.charAt(i));
                        i++;
                        continue;
                    }
                }
            }
            
            
            while (!op.empty())
                postfix.append(op.pop());
    
            return postfix.toString();
        }
         static boolean isOperator(char ch) {
            if (ch == ')' || ch == '(' || ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-')
                return true;
            return false;
        }
        public static int priority(char ch) {
    
            if (ch == '^')
                return 9;
            if (ch == '*' || ch == '/')
                return 8;
            if (ch == '+' || ch == '-')
                return 7;
            return -1;
        }
    }
}
