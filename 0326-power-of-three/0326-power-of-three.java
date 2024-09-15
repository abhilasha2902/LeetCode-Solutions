class Solution {
    public boolean isPowerOfThree(int n) {
        int a = 1162261467;
        if(n<=0 || n>a)return false;
        return a%n==0;
    }
}

