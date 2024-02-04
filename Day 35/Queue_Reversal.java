class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s=new Stack<>();
        while(q.isEmpty()==false){
            s.push(q.remove());
        }
        while(s.isEmpty()==false){
            q.add(s.pop());
        }
        return q;
    }
}