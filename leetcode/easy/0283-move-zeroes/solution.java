class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int c=0;
        int g=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
                c++;
            }
        }
        
        System.out.println(Arrays.toString(nums));
        
    }
}