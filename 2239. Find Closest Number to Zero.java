class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            if(Math.abs(num) < Math.abs(min)|| num == Math.abs(min)){
                min = num;
            }
        }   
        return min;
    }
}
