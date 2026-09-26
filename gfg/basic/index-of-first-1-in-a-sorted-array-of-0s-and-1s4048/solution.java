class Solution {
    public int firstIndex(int arr[]) {
        int i=0;
        while(i<arr.length){
            if(arr[i]==1){
                return i;
            }
            i++;
            
        }
        
        return -1;
    }
}