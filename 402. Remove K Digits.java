class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            if(!st.isEmpty() || num.charAt(i)!='0') st.push(num.charAt(i));
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if (st.isEmpty())
            return "0";
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}
