class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0; 
        if (nums.length == 1) return nums[0]; 
         int f = 0, s = 0;
  for (int num : nums) {
            int temp = f;
            f = Math.max(f, s + num);
            s = temp;
        }
      return f;
    }
}
