class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int mi = l + (r-l)/2;
            int mv=matrix[mi/n][mi%n];
            if(mv>target){
                r=mi-1;
            }else if(mv<target){
                l=mi+1;

            }else if(mv==target){

                return true;
            }
        }
        return false;
        
    }
}