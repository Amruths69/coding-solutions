class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==1)
            c++;
            else
            c=0;
            max=Math.max(c,max);
            i++;
        }
        return max;}}