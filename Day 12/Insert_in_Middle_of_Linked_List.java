public class Insert_in_Middle_of_Linked_List {
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        int len=0;
        Node temp=new Node(data);
        Node curr=head;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        int m=(int)Math.ceil(len/2);
        curr=head;
        for(int i=0;i<m;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
}
