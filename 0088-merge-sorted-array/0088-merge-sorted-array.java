class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1; // Index of the last position in nums1
        m--;  // Set m and n to point to the last element in nums1 and nums2 respectively
        n--;
        
        // Merge nums1 and nums2 from the back
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[last] = nums1[m];
                m--;
            } else {
                nums1[last] = nums2[n];
                n--;
            }
            last--;
        }
        
        // If nums2 is not fully traversed, add the remaining elements
        while (n >= 0) {
            nums1[last] = nums2[n];
            n--;
            last--;
        }
    }
}
