class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] in=new int[n][n];
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                int sc=(c-rowShift[r]%n+n)%n;
                int sr =(r-colShift[sc]%n+n)%n;
                in[sr][sc]=grid[r][c];
            }
        }
        return in;
        
        
    }
}