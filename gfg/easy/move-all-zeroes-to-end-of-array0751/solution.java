class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int t=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[t]=arr[i];
                t++;
            }
        }
        for(int i=t;i<arr.length;i++){
            arr[i]=0;
        }
        
    }
}