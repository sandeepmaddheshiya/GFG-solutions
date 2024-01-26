import java.util.Stack;
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int res=getMaxArea(M[0],m);
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==1){
                    M[i][j]+=M[i-1][j];
                }
                
            }
            res=Math.max(res,getMaxArea(M[i],m));
        }
        return res;
        
    }
    
    static int getMaxArea(int hist[], int n) 
    {
       
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && hist[s.peek()] >= hist[i]) {
                int tp = s.pop();
                int curr = hist[(int)tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int tp = s.pop();
            int curr = hist[tp] * (s.isEmpty() ? n : (n - s.peek() - 1));
            res = Math.max(curr, res);
        }
        return res;
    }
}