package Day 15;

public class Remove_loop_in_Linked_List {
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return;
        slow=head;
        Node f_prev=null;
        while(slow!=fast){
            slow=slow.next;
            f_prev=fast;
            fast=fast.next;
        }
        if(f_prev==null){
            fast=slow.next;
            while(fast!=slow){
                f_prev=fast;
                fast=fast.next;
            }
        }
        f_prev.next=null;
    }
}
