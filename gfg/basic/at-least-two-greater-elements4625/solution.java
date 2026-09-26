class Solution {
    public long[] findElements(long arr[]) {
        long[] ans=new long[arr.length-2];
        long m=arr[0];
        long c=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
               
            }
        }
        long g=m;
        m=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(g!=arr[i] && m<arr[i] ){
                m=arr[i];
            }
        }
        long g2=m;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=g2 && arr[i]!=g){
                ans[t]=arr[i];
                t++;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}