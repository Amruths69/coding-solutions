class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l=0;
        int r=arr.length-1;
        int a=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==k){
                a=m;
                r=m-1;
            }else if(arr[m]<k){
                
                l=m+1;
                
            }else if(arr[m]>k){
                r=m-1;
            }
            
        }
        return a;
    }
}