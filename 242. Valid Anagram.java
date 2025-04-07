class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[] = new int[256];
        if(s.length()!=t.length()) return false;
        int n = s.length();
        for(int i=0;i<n;i++){
           freq1[s.charAt(i)]++;
           freq1[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]>=1) return false;
        }

        return true;
    }
}
