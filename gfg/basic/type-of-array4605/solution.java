class Solution {
    int typeOfArr(int arr[]) {
        // code here
        int a=0;
        int d=0;
        int ar=0;
        int dr=0;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               d++;
               
           }
           else if(arr[i]<arr[i+1]){
               a++;
           }
       }
       if(d==arr.length-1){
           return 2;
       }else if(a==arr.length-1){
           return 1;
       }else if(d==1){
           
           return 4;
       }else{
           return 3;
       }
    }
}
