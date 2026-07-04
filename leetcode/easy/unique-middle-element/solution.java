class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int g=nums[nums.length/2];
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==g){
                c++;
            }else{
                continue;
            }
            
        }
        if(c==1){
            return true;
        }
        return false;
        
    }
}