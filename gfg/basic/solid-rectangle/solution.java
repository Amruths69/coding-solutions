class Solution {
    public void printSolidRectangle(int n, int m) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}