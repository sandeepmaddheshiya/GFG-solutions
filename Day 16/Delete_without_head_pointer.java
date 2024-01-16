
public class Delete_without_head_pointer {
    void deleteNode(Node del)
    {
         // Your code here
         del.data=del.next.data;
         del.next=del.next.next;
    }
}
