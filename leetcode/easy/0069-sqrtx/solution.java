class Solution {
    public int mySqrt(int x) {
        int m=0;
        int max=0;
        for(int i=1;i<=x;i++){
            if((long)i*i<=x){
            m= i;
           
            }
            else{
                break;
            }


            
        }
        return m;
        
    }
}