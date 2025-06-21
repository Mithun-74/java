class Solution {

    public boolean Helper(int n){
        if(n%3!=0 || n<1) return false;
        if(n==3) return true;
        return Helper(n/3);
    }
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        return Helper(n);
    }
}
