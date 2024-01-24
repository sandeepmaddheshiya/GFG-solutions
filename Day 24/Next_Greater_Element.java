import java.util.Stack;

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
         Stack<Integer>s=new Stack<>();
         long[]a=new long[n];
         s.push(0);
         for(int i=1;i<n;i++){
             long next=arr[i];
             while(next>arr[s.peek()]){
                 a[s.peek()]=next;
                 s.pop();
                 if(s.isEmpty()==true){
                     break;
                 }
             }
             s.push(i);
         }
          for(int i=0;i<n;i++){
              if(a[i]==0){
                  a[i]=-1;
              }
          }
        return a;
        
    } 
}