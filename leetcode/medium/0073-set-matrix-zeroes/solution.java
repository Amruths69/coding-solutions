class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //creating boolean array for row & col
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //checking whr zero is and intializing row[i] and col[j] as true:
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;                    
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //condn where we set true ,eg; 0||1=1 :
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}