class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int[] ans=new int[arr.length];
        int t=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[t]=arr[i];
            t++;
        }
      
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        
    }
}