class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[] ans=new int[2];
        int a=target;
        int h=0;
        int g=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=a){
                h++;
            } if(arr[i]<=a){
                g++;
            }
        }
        ans[0]=g;
        ans[1]=h;
        return ans;
    }
}