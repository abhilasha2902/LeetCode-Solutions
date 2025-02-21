class NumArray {
    int[] ps;  // Prefix sum array

    public NumArray(int[] nums) {
        ps = new int[nums.length + 1]; // Extra space to store sum up to index i
        for (int i = 1; i <= nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i - 1]; // Correct prefix sum computation
        }
    }

    public int sumRange(int left, int right) {
        return ps[right + 1] - ps[left]; // Correct sum calculation
    }
}
