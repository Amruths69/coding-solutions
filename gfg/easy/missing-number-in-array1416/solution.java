class Solution {
    int missingNum(int arr[]) {
        if(arr.length==1 && arr[0]==1){
            return 2;
        }
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }else{
                continue;
            }
                
            
        }
        return arr.length+1;
    }
}