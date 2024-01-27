import java.util.Stack;

public class Reverse_a_string_using_Stack {
    public String reverse(String S){
        //code here
        String r="";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<S.length();i++){
            s.push(S.charAt(i));
        }
        for(int i=0;i<S.length();i++){
            r+=s.pop();
        }
        return r;
    }
}
