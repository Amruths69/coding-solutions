class Solution {
    public void sortColors(int[] nums) {
        int l=0; int c=0; int h=nums.length-1;
        while(c<=h){
            if(nums[c]==0){
                swap(nums,c,l);
                l++;
                c++;
            }else if(nums[c]==2){
                swap(nums,c,h);
                //element from h could be 0 so no c++;
                h--;
            }else{
                c++;
            }

        }
        

    }
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
        
    }
}