class Solution {
public static int maxSideLength(int[][] mat, int threshold) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int s = 1, e = Math.min(mat.length, mat[0].length);
                while (s <= e) {
                    int mid = s + (e - s) / 2;
                    if (mid + i > mat.length || mat[0].length < mid + j) e=mid-1;
                    else if (SumMatrix(mat, i, j, mid) <= threshold) {
                        s = mid + 1;
                         if (mid > ans) {
                            ans = mid;
                        }
                    } else e = mid - 1;
                }
            }
        }
        return ans;
    }


    public static int SumMatrix(int[][] mat, int start, int end, int val) {
        int sum = 0;
        for (int i = start; i < start + val; i++) {
            for (int j = end; j < end + val; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}