class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(Map.Entry<Integer,Integer> en:hm.entrySet()){
            if(max<en.getValue()){
                 max = en.getValue();
                 val = en.getKey();
            }
        }
        return val;
    }
}
