class Solution {
    public double recursion(double x, int n) {
        if (n == 0) return 1;  // base case: x^0 = 1
        double half = recursion(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / recursion(x, -n);
        }
        return recursion(x, n);
    }
}
