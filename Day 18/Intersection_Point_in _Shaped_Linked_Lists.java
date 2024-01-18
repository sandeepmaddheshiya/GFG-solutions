

public class Intersection_Point_in _Shaped_Linked_Lists {
    int intersectPoint(Node head1, Node head2)
	{
         // code here
       
         
         int len1=0,len2=0;
         for(Node curr1=head1;curr1!=null;curr1=curr1.next){
             len1++;
         }
         for(Node curr2=head2;curr2!=null;curr2=curr2.next){
             len2++;
         }
        Node curr1=head1,curr2=head2;
         if(len1>len2){
             for(int i=0;i<Math.abs(len1-len2);i++){
                 curr1=curr1.next;
             }
         }
         else{
             for(int i=0;i<Math.abs(len1-len2);i++){
                 curr2=curr2.next;
             }
         }
         
         
         while(curr1!=null && curr2!=null){
             if(curr1==curr2){
                 return curr1.data;
             }
             curr1=curr1.next;
             curr2=curr2.next;
         }
         return -1;
	}
}
