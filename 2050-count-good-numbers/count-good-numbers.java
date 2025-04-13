class Solution {
    static final int MOD = 1_000_000_007;

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        if(n==1) return 5;
        long even;
        if(n%2==0) even = n/2;
        else even=(n/2)+1;
        long odd = n - even;

        long evenCount = modPow(5, even, MOD); // 5 choices for even indices
        long oddCount = modPow(4, odd, MOD);   // 4 choices for odd indices

        return (int)((evenCount * oddCount) % MOD);
    }
}
