class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1; int r=1;
        for(int p:piles){
            r=Math.max(r,p);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(cf(piles,mid,h)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
        
    }
    private static boolean cf(int[] piles,int speed,int h){
        int hours=0;
        for(int i:piles){
            hours+=Math.ceil((double)i/speed);
        }
        return hours<=h;
    }
}