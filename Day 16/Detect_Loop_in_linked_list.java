
public class Detect_Loop_in_linked_list {
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
