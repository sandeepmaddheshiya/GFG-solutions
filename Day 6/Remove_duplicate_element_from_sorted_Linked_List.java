
public class Remove_duplicate_element_from_sorted_Linked_List {
    Node removeDuplicates(Node head)
    {
	// Your code here	
	Node curr=head;
	while(curr!=null && curr.next!=null){
	    if(curr.next.data==curr.data){
	        curr.next=curr.next.next;
	    }
	    if(curr.next==null){
	        return head;
	    }
	    if(curr.next.data!=curr.data){
	        curr=curr.next;
	    }
	}
	
	return head;
    }
}
