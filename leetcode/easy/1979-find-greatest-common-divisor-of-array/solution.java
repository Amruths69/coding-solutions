class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int j=nums[0];
        int g=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=Math.max(nums[i],max);
        }

        }
        for(int i:nums){
            if(i<min){
                min=Math.min(i,min);
            }
        }
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                g=Math.max(i,g);
            }
        }
        return g;
    }
}