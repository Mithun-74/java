class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxlen = 0;
        int n = arr.length;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           
           if(sum==k){
                maxlen = Math.max(maxlen,i+1);
           }
           
           int value = sum-k;
           if(hm.containsKey(value)){
               maxlen = Math.max(maxlen,i-hm.get(value));
           }
           
           hm.putIfAbsent(sum, i);
       }
       return maxlen;
    }
}
