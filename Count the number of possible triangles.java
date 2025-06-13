// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            int l=0; int r=i-1;
            while(l<r){
                int sum = arr[l]+arr[r];
                if(arr[i]<sum){
                    ans += r-l;
                    r--;
                }
                else l++;
            }
        }
        return ans;
    }
}
