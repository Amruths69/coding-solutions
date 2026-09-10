class Solution {
    public int findDuplicate(int[] nums) {
        int s=nums[0];
        int f=nums[nums[0]];
        while(s!=f){
            s=nums[s];
            f=nums[nums[f]];
        }
        s=0;
        while(s!=f){
            s=nums[s];
            f=nums[f];
        }
        return s;
        
    }
}