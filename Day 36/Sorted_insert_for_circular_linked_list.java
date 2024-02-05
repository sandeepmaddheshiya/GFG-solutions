class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node curr=head;
        Node temp=new Node(data);
        
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else if(data<=head.data){
            while(curr.next!=head)
                curr=curr.next;
    
            curr.next=temp;
            temp.next=head;
            return temp;
            
        }
        else{
            while(curr.next!=head&&data>curr.next.data){
                curr=curr.next;
                
            }
            temp.next=curr.next;
            curr.next=temp;
            return head;
        }
       
       
    }
}