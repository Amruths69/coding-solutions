class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int sm=0;
        int c=0;
        int bi=nums.length;
        
        int r=nums.length;
        
        int t=0;
        while(l<r){
            if(nums[l]!=0){
                nums[t]=nums[l];
                t++;
                c++;
            }
           
            
            l++;


        }
        while(c<bi){
            
            nums[c]=0;
            
        c++;
        }
        
        System.out.println(Arrays.toString(nums));
        
        
    }
}