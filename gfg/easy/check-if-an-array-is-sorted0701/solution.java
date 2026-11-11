class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                c++;
            }
        }
        return c==arr.length?true:false;
    }
}