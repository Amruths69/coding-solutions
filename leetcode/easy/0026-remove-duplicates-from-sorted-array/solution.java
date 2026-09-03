class Solution {
    public int removeDuplicates(int[] nums) {
        int ii=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[ii]=nums[i];
                ii++;
            }

        }
        return ii;

        
    }
}