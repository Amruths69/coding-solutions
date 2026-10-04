class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int g=arr[0];
        
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(g<arr[i]){
                m2=g;
                g=arr[i];
            }else if(m2<arr[i] && arr[i]!=g){
                m2=arr[i];
            }
        }
        return m2==Integer.MIN_VALUE?-1:m2;
        
    }
}