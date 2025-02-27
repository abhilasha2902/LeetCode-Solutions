class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int ar=0;
        while(l<r){
            int w=r-l;
            int h = Math.min(height[l],height[r]);
            ar=Math.max(ar,w*h);
                    
                    if(height[l]<height[r]){
                        l++;
                    }else{
                        r--;
                    }
        }
                    return ar;
    }
    
}