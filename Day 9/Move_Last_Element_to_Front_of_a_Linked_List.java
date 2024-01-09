
public class Move_Last_Element_to_Front_of_a_Linked_List {
    public static Node moveToFront(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        Node temp=curr.next;
        curr.next=null;
        temp.next=head;
        return temp;
        
    }
}
