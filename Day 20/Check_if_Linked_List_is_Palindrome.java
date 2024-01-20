

public class Check_if_Linked_List_is_Palindrome {
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Deque<Integer> stack=new ArrayDeque<Integer>();
        for(Node curr=head;curr!=null;curr=curr.next){
            stack.push(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            if(stack.pop()!=curr.data){
                return false;
            }
        }
        return true;
    }    
}
