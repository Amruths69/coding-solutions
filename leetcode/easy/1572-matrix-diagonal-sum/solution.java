class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            sum += mat[i][n - 1 - i];
        }

        // if matrix size is odd,
        // center element counted twice
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}