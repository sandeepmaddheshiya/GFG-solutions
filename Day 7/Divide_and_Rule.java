/**
 * Divide_and_Rule
 */
public class Divide_and_Rule {
    public static long numOfWays(int n) {
        // code here
        
        if(n%2!=0 || n<=4){
            return 0;
        }
        long k=n/4;
        if(n%4==0) k--;
        k*=6;
        return k;
    }
    
}