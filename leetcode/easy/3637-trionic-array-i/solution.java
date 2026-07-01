class Solution {
    public boolean isTrionic(int[] nums) {
        int g=nums[0];
        int f=0;
        for(int i=1;i<nums.length;i++){
            if(g<nums[i]){
                g=nums[i];

            }else if(g>nums[i]){
                f=nums[i];

            }

        }
        if(g<f){
            return true;
        }
        return false;

        
    }
}