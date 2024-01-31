import java.util.Stack;

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c == '-' || c == '+' || c == '/') {
                int b = st.pop();
                int a = st.pop();
                st.push(eval(a, b, c));
            } else {
                st.push(Character.getNumericValue(c));
            }
        }
        return st.pop();
    }
       public static int eval(int a,int b,char operator){
        if(operator=='+'){
            return a+b;
        }
        else if(operator=='-'){
            return a-b;
        }
        else if(operator=='*'){
            return a*b;
        }
        return a/b;
    }
}