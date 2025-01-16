class Solution {
    public int kthGrammar(int n, int k) {
        int l = 0;
        int h = (int) Math.pow(2, n - 1) - 1;
        int curr = 0;
        k--; // Convert k to zero-based index

        while (l != h) {
            int m = (l + h) / 2;
            if (k <= m) {
                h = m;
            } else {
                l = m + 1;
                curr = 1 - curr; // Toggle the value of curr
            }
        }
        return curr;
    }
}
