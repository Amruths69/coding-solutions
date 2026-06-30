class Solution {
    public int removeElement(int[] nums, int val) {
        //pointers assigning
        int l=0;
        int r=nums.length-1;
        int g=0;
        //loop to traverse
        while(l<=r){
            
            if(nums[l]!=val){
                nums[g]=nums[l];
                
                l++;
                g++;
                
            }else{
                l++;
            }
            
        }
        return g;
        
    }
}