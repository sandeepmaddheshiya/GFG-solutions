class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> s=new Stack<>();
        s.push(0);
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false&&price[s.peek()]<=price[i]){
                s.pop();
            }
            ans[i]=s.isEmpty()?i+1:i-s.peek();
            s.push(i);
        }
        return ans;
    }
    
}