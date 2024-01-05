
public class Reverse_a_linked_list {
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node curr=head;
        Node next=curr.next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
