class Solution {    
    public void makeItOrder(long arr[]){
        int n = arr.length;
        for(int j=0;j<n;j++){
            if(arr[j]%2!=0){
                  arr[j]*=-1;
            }
        }
    }

    public void sortIt(Long arr[]) {
        // code here.
        makeItOrder(arr);
        Arrays.sort(arr);
        makeItOrder(arr);
    }
}
