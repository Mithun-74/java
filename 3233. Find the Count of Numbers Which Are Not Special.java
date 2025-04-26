class Solution {
    
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean isSpecial(int n) {
        int val = (int) Math.sqrt(n);
        return (val * val == n) && isPrime(val);
    }

    public int nonSpecialCount(int l, int r) {
        int count = r - l + 1;
        for (int i = l; i <= r; i++) {
            if (isSpecial(i)) {
                count--;
            }
        }
        return count;
    }
}
