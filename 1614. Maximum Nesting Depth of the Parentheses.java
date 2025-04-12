class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count=0;
        int max = Integer.MIN_VALUE;
        for(char i:s.toCharArray()){
            if(i=='(') count++;
            max = Math.max(max,count);
            if(i==')') count--;
        }
        return max;
    }
}
