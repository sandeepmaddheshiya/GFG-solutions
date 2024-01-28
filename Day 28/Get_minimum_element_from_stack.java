class GfG
{
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
        s=new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	return (s.isEmpty())?-1:minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty()) return -1;
	int t=s.pop();
	if(t<minEle){
	   int res=minEle;
	    minEle=2*minEle-t;
	    return res;
	}else{
	    return t;
	}
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	if(s.isEmpty()){
	    minEle=x;
	    s.push(x);
	}else if(x<=minEle){
	    s.push(2*x-minEle);
	    minEle=x;
	}else{
	    s.push(x);
	}
    }	
}