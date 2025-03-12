class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        HashMap<Integer,Integer> map = new HashMap();
        int n = arr.length;
          for(int i=0;i<n;i++){
              for(int j=i+1;j<n;j++){
                  int value = target-(arr[i]+arr[j]);
                  if(map.containsKey(value)) return true;
              }
                  map.put(arr[i],i);
          }
          return false;
    }
}
