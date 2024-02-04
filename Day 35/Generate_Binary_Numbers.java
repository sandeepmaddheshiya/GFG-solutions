class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
         ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=0; i<N; i++) {
            String temp = q.remove();
            list.add(temp);
            q.add(temp+"0");
            q.add(temp+"1");
        }
        return list;
    }
    
}