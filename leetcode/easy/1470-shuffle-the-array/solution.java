class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=nums.length;
        int[] a1=new int[a-n];
        int[] a2=new int[a-n];
        int[] a3=new int[a];
        
        
        for(int i=0;i<n;i++){
            a1[i]=nums[i];
            
            }
        for(int h=n;h<a;h++){
            a2[h-n]=nums[h];
        }
        for(int i=0;i<a;i+=2){
            a3[i]=a1[i/2];
            a3[i+1]=a2[i/2];
        }
        return a3;
        
    }
}
