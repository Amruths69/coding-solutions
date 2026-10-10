class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n=nums.length;
        int[] r=new int[]{-1,-1};
        int mP=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i!=j && nums[i]+nums[j]==target && nums[i]>nums[j]){
                int p=nums[i]*nums[j];
                if(p>mP){
                    mP=p;
                    r[0]=i;
                    r[1]=j;
                }
            }
        }
        
    }
        return r;
    }}