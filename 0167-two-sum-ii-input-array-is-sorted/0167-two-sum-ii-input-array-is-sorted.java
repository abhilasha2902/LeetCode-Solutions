class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;int r=numbers.length-1;
        int sum=0;
        int c=0;
        while(l<r){
         sum = numbers[l] + numbers[r];
         if(sum==target){
            return new int[]{l + 1, r + 1};
         }else if (sum < target) {
            l++;
         }else {
            r--;
         }
        }
        return new int[]{l+1,r+1};
    }
}