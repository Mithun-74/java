class Solution {
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int curr = nums[start];
            nums[start]=nums[end];
            nums[end]=curr;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;

        if(n>k){
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        }
    }
}
