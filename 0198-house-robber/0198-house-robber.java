class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0; 
        if (nums.length == 1) return nums[0]; 
         int f = 0, s = 0;
  for (int num : nums) {
           s = Math.max(f+num, f=s);
        }
      return s;
    }
}
