class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        int[] coins = {2000,500,200,100,50,20,10,5,2,1};
        
        List<Integer> ls = new ArrayList<>();
        int i=0;
        while(N!=0){
            if(coins[i]>N) i++;
            else{
                ls.add(coins[i]);
                N-=coins[i];
            }
        }
        return ls;
    }
}
