class Solution {
    public int shortestUnorderedSubarray(int arr[]) {
        // Code Here
        int c=0;
        int m=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                c++;
            }else if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                c++;
            }
            
            
        }
        
        if(c!=0){
            return 3;
        }else{
            return 0;
        }
    }
}