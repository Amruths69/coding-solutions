class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int a=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        while(l<=r){
            if(nums[l]<nums[r]){
                a=Math.min(a,nums[l]);
            }
            int mid=(l+r)/2;
            a=Math.min(a,nums[mid]);
            if(nums[l]<=nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return a;

        
    }
}