class Solution {
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<n;i++){
             int value = target-arr[i];
            if(map.containsKey(value)) return true;
            
            map.put(arr[i],i);
        }
        return false;
    }
}
