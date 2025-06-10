class Solution {
    boolean checkIsPrime(int num){
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6){
             if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
    
    int isTwistedPrime(int N) {
        // code here
        int temp = N;
        int reverse=0;
        while(N!=0){
           int rem = N%10;
           reverse = reverse*10 + rem;
           N/=10;
        }
        
        if (checkIsPrime(temp) && checkIsPrime(reverse)) return 1;
        else return 0; 
    }
}
