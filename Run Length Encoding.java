class Solution {
    public static String encode(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        int count=1;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                res.append(s.charAt(i)).append(count);
                // res+=String.valueOf(s.charAt(i)) +count;
                count=1;
            }
        }
        // res+=String.valueOf(s.charAt(n-1)) +count;
        res.append(s.charAt(n-1)).append(count);
        return res.toString();
    }
}
