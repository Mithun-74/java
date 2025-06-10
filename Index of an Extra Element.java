/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int j=0;
        int n=a.length;
        int m=b.length;
        int end=0;
        for(int i=0;i<n && j<m;i++){
            if(a[i]!=b[j]) return j;
            else j++;
            end = i+1;
        }
        
        return end;
    }
}
