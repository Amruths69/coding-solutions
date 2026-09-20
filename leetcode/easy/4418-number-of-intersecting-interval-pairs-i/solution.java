class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int c=0;
        int n=intervals.length;
        for(int i=0;i<n;i++){
        
        for(int j=i+1;j<n;j++){
            if(intervals[i][0]<=intervals[j][1]&&intervals[j][0]<=intervals[i][1]){
                c++;
            }
        }}
        return c;
        
    }
}