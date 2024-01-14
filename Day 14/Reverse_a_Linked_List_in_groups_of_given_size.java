
public class Reverse_a_Linked_List_in_groups_of_given_size {
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node curr=node,next=null,prev=null;
        int count=0;
        while(curr != null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node res_head=reverse(next,k);
            node.next=res_head;
            
        }
        return prev;
        
    }
}
