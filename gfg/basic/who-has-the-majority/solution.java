class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int cx=0;
        int cy=0;
        for(int i:arr){
            if(i==x){
                cx++;
            }else if(i==y){
                cy++;
            }
        }
        if(cx>cy){
            return x;
        }else if(cx==cy){
            return Math.min(x,y);
        }else{
            return y; 
        }
        
        
    }
}