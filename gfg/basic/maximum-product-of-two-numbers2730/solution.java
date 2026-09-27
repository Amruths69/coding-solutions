class Solution {
    public static int maxProduct(int[] arr) {
        int g=arr[0];
        int a=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(g<arr[i]){
                a=g;
                g=arr[i];
            }else if(a<arr[i]){
                a=arr[i];
                
            }
        }
        return a*g;
        
    }
}
