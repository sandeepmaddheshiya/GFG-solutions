class MyQueue {

    int front, rear,size;
	int arr[] = new int[100005];
	

    MyQueue()
	{
		front=0;
		rear=-1;
		size=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	     if(rear == arr.length-1){
            return;
        }
        arr[++rear] = x;
        size++;
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(size==0) return -1;
		int p=arr[front++];
		size--;
		return p;
	} 
	

}