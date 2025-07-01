class Solution {
    public int findLHS(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(hm.containsKey(i+1)){
                result = Math.max(result, hm.get(i)+hm.get(i+1));
            }
        }
        return result;
    }
}
