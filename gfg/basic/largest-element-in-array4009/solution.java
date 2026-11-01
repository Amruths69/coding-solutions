class Solution {
    public static int largest(int[] arr) {
        // code here
        int g=0;
        for(int i=0;i<arr.length;i++){
            if(g<arr[i]){
                g=arr[i];
            }
        }
        return g;
    }
}
