class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int g=Integer.MIN_VALUE;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>g){
                m=g;
                g=arr[i];
            }else if(arr[i]>m && arr[i]!=g){
                m=arr[i];
            }
        }
        return m==Integer.MIN_VALUE?-1:m;
        
    }
}