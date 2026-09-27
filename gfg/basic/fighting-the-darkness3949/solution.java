class Solution {
    public int maxDays(int arr[]) {
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        return m;
        
    }
}