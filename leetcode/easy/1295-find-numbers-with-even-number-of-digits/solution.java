class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int n:nums){
            int h=(int)Math.log10(n)+1;
            if(h%2==0)
            c++;
            
        }
        return c;
        
    }
}