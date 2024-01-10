public class Find_Missing_And_Repeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
          int ar[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            ar[arr[i]]++;
        }
        
        int mis=-1;
        int rep=-1;
        
        for(int i=1;i<ar.length;i++){
            if(ar[i]==2){
                rep=i;
            }
            if(ar[i]==0){
                mis=i;
            }
        }
        
        int result[]={rep,mis};
        return result;
        
    }
}
