class Solution {
    boolean isSubSequence(String A, String B) {
        int j=0;
        int n = A.length();
        int m = B.length();
        for(int i=0;i<m && j<n;i++){
            if(A.charAt(j)==B.charAt(i)){
                j++;
            }
        }
        return j==n;
    }
}
