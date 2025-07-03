class Solution {
    public StringBuffer find_the_pattern(StringBuffer st,int k){
        if(st.length()>=k){
            return st;
        }
        StringBuffer ns = new StringBuffer();
        int n = st.length();
        for(int i=0;i<n;i++){
            char ch = st.charAt(i);
            char newchar = (char) ((ch - 'a' + 1) % 26 + 'a');
            ns.append(newchar);
        }
        st.append(ns);
        return find_the_pattern(st,k);
    }

    public char kthCharacter(int k) {
        StringBuffer st = new StringBuffer("a");
        StringBuffer result = find_the_pattern(st, k);
        return result.charAt(k-1);
    }
}
