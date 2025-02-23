class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;int l=0;
        int c=0;
        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
             while (pro >= k && l <= r) {
                pro /= nums[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}