class Solution {
    public String largestOddNumber(String num) {
       int n = num.length();
       for(int i=n-1;i>=0;i--){
           int b = num.charAt(i)-'0';
           if(b%2==1){
               return num.substring(0,i+1);
           }
       }
       return "";
    }
}
