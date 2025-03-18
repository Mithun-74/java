class Solution {

    private void swap(int st,int en, int[] nums){
            int curr = nums[st];
            nums[st]=nums[en];
            nums[en]=curr;
    }

    public void sortColors(int[] nums) {
        int mid=0;
        int low = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                mid++; low++;
            }

            else if(nums[mid]==1) mid++;

            else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }
        }
    }
}
