class Solution {
    public int removeDuplicates(int[] nums) {
        int t=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[t]=nums[i];
                t++;
            }
        }
        return t;
        
    }
}