class Solution {
    public void sort012(int[] arr) {
        // code here
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                
                c0++;
            }
        }
          for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                
                c1++;
            }
        }
          for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                
                c2++;
            }
        }
        int t=0;
        for(int i=0;i<c0;i++){
            arr[t]=0;
            t++;
        }
        for(int i=0;i<c1;i++){
            arr[t]=1;
            t++;
        }
        for(int i=0;i<c2;i++){
            arr[t]=2;
            t++;
        }
              

        
    
}}