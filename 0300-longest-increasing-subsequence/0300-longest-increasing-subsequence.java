import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> dp = new ArrayList<>();
        for (int num : nums) {
            int index = Collections.binarySearch(dp, num); 
         if (index < 0) { 
                index = -(index + 1);
            }
         if (index == dp.size()) {
                dp.add(num);
            } else {
                dp.set(index, num); 
            }
        }
         return dp.size(); 
    }
}
