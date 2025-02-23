class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int l=0,sum=0;
        int minL = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=t){
                minL=Math.min(minL,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return (minL==Integer.MAX_VALUE)?0:minL;
    }
}