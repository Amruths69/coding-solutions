
class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int[][] t=intervals;
        long c=0;
        int n=t.length;
        java.util.Arrays.sort(t,(x,y)->Integer.compare(x[0],y[0]));
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            int p=i;
            int t1=t[i][1];
            while(l<=r){
                int m=l+(r-l)/2;
                if(t[m][0]<=t1){
                    p=m;
                    l=m+1;
                }else{
                    r=m-1;
                }
            }
            if(p>i){
                c+=(p-i);
            }
        }
        return c;
        
    }
}