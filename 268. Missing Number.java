class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=i) return i;
        }
        return nums[n-1]+1;
    }
}
