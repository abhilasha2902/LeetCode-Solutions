import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> dp = new ArrayList<>();
        for (int num : nums) {
            int index = Collections.binarySearch(dp, num); 
            // it will return negative number if not found  that's why 
            //down we are checking the condition 
            //if the num is found did it ,return a negative number  
         if (index < 0) { 
                index = -(index + 1);
            }
         if (index == dp.size()) { //when num is greater than all element present in dp
                dp.add(num);
            } else {
                dp.set(index, num);  //here we insert the element at the found index in other case than the above one  
            }
        }
         return dp.size(); 
    }
}
