class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int c=1;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                c++;
                continue;
            }
            else{
                break;
            }
            
        }
        return c;
        
    }
}