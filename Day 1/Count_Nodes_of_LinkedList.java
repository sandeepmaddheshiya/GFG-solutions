/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        Node curr=head;
        int res=0;
        while(curr!=null){
            res++;
            curr=curr.next;
        }
        return res;
    }
}
    