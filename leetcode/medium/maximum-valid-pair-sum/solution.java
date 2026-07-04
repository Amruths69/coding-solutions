class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int m=nums[0];
        int a=0;
        for(int i=k;i<nums.length;i++){
            m=Math.max(m,nums[i-k]);
            a=Math.max(a,m+nums[i]);
        }
        return a;
    }
}