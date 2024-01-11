
public class Finding_middle_element_in_a_linked_list {
    int getMiddle(Node head)
    {
         // Your code here.
         int count=0;
         Node curr;
         for(curr=head;curr!=null;curr=curr.next){
             count++;
         }
         curr=head;
         for(int i=0;i<count/2;i++){
             curr=curr.next;
         }
         return curr.data;
    }
}
