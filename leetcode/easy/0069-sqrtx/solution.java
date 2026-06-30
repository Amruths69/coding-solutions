class Solution {
    public int mySqrt(int x) {
        int m=0;
        for(int i=1;i<x;i++){
            if(i*i==x){
            m= i;
           break;
            }
        }
        return m;
        
    }
}