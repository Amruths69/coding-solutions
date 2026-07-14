class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int t=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[t]=nums[i];
                t++;

            }
        }
        return t;
        
    }
}