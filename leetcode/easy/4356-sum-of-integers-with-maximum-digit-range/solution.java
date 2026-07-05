class Solution {
    public int maxDigitRange(int[] nums) {
        
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
                int h=nums[i];
                int max=0;
                int min=9;
                while(h>0){
                    int d=h%10;
                    if(d>max){
                        max=d;
                    }if(d<min){
                        min=d;
                    }
                    h=h/10;
                }
            ans[i]=max-min;
            
            
            
        }
        int r=0;
        int k=0;
        
        for(int i=0;i<ans.length;i++){
            
            if(ans[i]>r){
                r=ans[i];
                    
            }
            
        }
        
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(ans[i]==r){
                s+=nums[i];
            }
        }
        return s;
        
    }
}