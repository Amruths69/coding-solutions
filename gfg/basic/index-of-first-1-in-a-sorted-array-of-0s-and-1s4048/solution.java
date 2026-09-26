class Solution {
    public int firstIndex(int arr[]) {
        int l=0;
        int r=arr.length-1;
        int t=1;
        int a=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(t==arr[m]){
                r=m-1;
                a=m;
                
                
            }else{
                l=m+1;
            }           
        }
        return a;
    }
}