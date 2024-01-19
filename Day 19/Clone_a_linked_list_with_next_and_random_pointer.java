
public class Clone_a_linked_list_with_next_and_random_pointer {
    Node copyList(Node head) {
        // your code here
        if(head == null || head.next == null)
            return head;
        Node temp = head;
        while(temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        temp = head;
        while(temp != null  && temp.next != null) {
            temp.next.arb = temp.arb == null ? null: temp.arb.next;
            temp = temp.next.next;
        }
        temp = head;
        Node copyHead = head.next;
        while(temp != null  && temp.next != null) {
            Node test = temp.next;
            temp.next = temp.next.next;
            temp = test;
        }
        return copyHead;
        
    }
}
