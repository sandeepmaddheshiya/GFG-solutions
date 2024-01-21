
public class Parenthesis_Checker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>s=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='['){
                s.push(x.charAt(i));
            }else{
                if(s.isEmpty()==true) return false;
                else if(matching(s.peek(),x.charAt(i))==false) return false;
                else s.pop();
            }
        }
        return (s.isEmpty()==true);
    }
    static boolean matching(char a, char b){
        return ((a=='('&&b==')')|| (a=='{'&& b=='}')||(a=='['&&b==']'));
    }
}
