import java.util.Stack;
class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        Stack<Long> s = new Stack<>();
        long res = 0;
        for (long i = 0; i < n; i++) {
            while (!s.isEmpty() && hist[(int)(long)s.peek()] >= hist[(int)i]) {
                long tp = s.pop();
                long curr = hist[(int)tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            long tp = s.pop();
            long curr = hist[(int)tp] * (s.isEmpty() ? n : (n - s.peek() - 1));
            res = Math.max(curr, res);
        }
        return res;
    }
        
}