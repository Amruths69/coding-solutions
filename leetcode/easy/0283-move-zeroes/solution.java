class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int c=0;
        int g=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[g]=nums[i];
                c++;
                g++;
            }
        }
        for(int j=c;j<n;j++){
            nums[j]=0;
        }
        System.out.println(Arrays.toString(nums));
        
    }
}