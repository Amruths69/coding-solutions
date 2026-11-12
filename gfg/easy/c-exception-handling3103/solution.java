class Solution {
    public int findMin(int a, int b) {
        // code here
        int ad=a+b;
        int su=a-b;
        int m=a*b;
        int di=Integer.MAX_VALUE;
        
        try{
             di=a/b;
        }
        catch(ArithmeticException e ){
            
        }
        int[] arr=new int[4];
        arr[0]=ad;
        arr[1]=su;
        arr[2]=m;
        arr[3]=di;
        int g=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=g){
                g=arr[i];
            }
        }
        return g;
    }
}