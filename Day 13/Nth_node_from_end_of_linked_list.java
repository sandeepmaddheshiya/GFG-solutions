
public class Nth_node_from_end_of_linked_list {
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node curr=head;
    	int len=0;
    	while(curr!=null){
    	    len++;
    	    curr=curr.next;
    	    
    	}
    	if(len<n) return -1;
    	curr=head;
    	for(int i=1;i<len-n+1;i++){
    	    curr=curr.next;
    	}
    	return curr.data;
    	
    }
}
