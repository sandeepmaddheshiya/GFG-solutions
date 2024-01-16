
public class Segregate_even_and_odd_nodes_in_a_Link_List {
    Node divide(int N, Node head){
        // code here
        Node eS=null, eE=null, oS=null,oE=null;
        for(Node curr=head;curr!=null;curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(eS==null){
                    eS=curr;
                    eE=eS;
                }
                else{
                    eE.next=curr;
                    eE=eE.next;
                }
            }
            else{
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }
                else{
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }
        if(oS==null || eS==null){
            return head;
        }
        eE.next=oS;
        oE.next=null;
        return eS;
    }
}
