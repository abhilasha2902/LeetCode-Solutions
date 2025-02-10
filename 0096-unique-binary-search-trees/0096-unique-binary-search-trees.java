class Solution {
    public int numTrees(int n) {
       int dp[] = new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++){
        for(int roots=1;roots<=i;roots++){
            dp[i]+=dp[roots-1]*dp[i-roots];//left*right
        }
       } 
       return dp[n]; 
    }
}
