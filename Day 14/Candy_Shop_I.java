public class Candy_Shop_I {
    public static int candyShop(int n, int[] candies) {
        // code here
        int sum=0;
        HashSet<Integer> hs=new HashSet<> ();
        for(int i=0;i<candies.length;i++){
            hs.add(candies[i]);
        }
        for(int element: hs){
            sum+=element;
        }
        return sum;
    }
}
