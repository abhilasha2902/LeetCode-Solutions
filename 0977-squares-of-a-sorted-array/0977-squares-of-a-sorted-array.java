class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int[] arr = new int[nums.length];
        int end=nums.length-1;
        while(l<=r){
            int lsqr=nums[l]*nums[l];
            int rsqr=nums[r]*nums[r];
            if(lsqr>rsqr){
                arr[end]=lsqr;
                l++;
            }else{
                arr[end]=rsqr;
                r--;
            }
          end--;
    }
    return arr;
    }
}