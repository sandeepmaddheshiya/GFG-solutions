
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

class Count_Nodes_of_LinkedList {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node temp=new Node(key);
        if(head.data>key){
            temp.next=head;
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null && curr.next.data<temp.data){
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
        return head;
    }
}
    