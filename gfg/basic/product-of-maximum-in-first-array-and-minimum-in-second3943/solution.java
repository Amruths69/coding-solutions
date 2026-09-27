
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int g=arr1[0];
        int h=arr2[0];
        for(int i=1;i<arr1.length;i++){
            if(g<arr1[i]){
                g=arr1[i];
            }
        }
        for(int i=1;i<arr2.length;i++){
            if(h>arr2[i]){
                h=arr2[i];
                
            }
        }
        return h*g;
        
    }
}