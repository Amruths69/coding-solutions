class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int g=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i>=k){
                    b=nums[i]+nums[j];
                    g=Math.max(g,b);
                    
                }
            }
            
        }
        return g;
    }
}