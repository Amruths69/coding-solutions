class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int w=Math.abs(r-l);
            int a=Math.min(height[l],height[r])*w;
            max=Math.max(max,a);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }

        }
        return max;
        
    }
}