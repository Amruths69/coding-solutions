class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target && nums[i-1]<target){
                return i;
            }
        }
        if(nums[nums.length-1]<target){
                return nums.length;
            }
        return -1;
        
    }
}