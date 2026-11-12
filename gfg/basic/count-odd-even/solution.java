class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int e=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                e++;
            }else{
                o++;
            }
        }
        int[] a=new int[2];
        a[0]=o;
        a[1]=e;
        return a;
        
    }
}