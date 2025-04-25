class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if((int) Math.floor(Math.log10(nums[i])+1) != 2){
                count1+=nums[i];
            }
            else count2+=nums[i];
        }
        if(count1==count2) return false;

        return true;
    }
}
