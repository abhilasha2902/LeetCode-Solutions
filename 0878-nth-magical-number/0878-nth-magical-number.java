import java.util.*;

class Solution {
    public int nthMagicalNumber(int N, int A, int B) {
        int MOD = 1_000_000_007;
        long lcm = (long) A * B / gcd(A, B); 

        long low = 1, high = (long) N * Math.min(A, B);
        while (low < high) {
            long mid = (low + high) / 2;
            long count = mid / A + mid / B - mid / lcm;
            if (count < N) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) (low % MOD);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
