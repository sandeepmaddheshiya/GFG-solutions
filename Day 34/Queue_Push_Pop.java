class Solution{
    
    public Queue<Integer> push(int arr[], int n)
    {
        //push all the elements of the array arr in the queue and return the queue
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        return q;
    }
    
    public void _pop(Queue<Integer> q)
    {
        //dequeue the elements and print them
        while(!q.isEmpty()){
            System.out.print(q.poll());
            System.out.print(" ");
        }
    }
}