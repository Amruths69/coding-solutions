class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr=source[0];
        int sc=source[1];
        int tr=target[0];
        int tc=target[1];
        if((sr+sc)%2!=(tc+tr)%2)
            return -1;
        else if(Math.abs(sc-tc)==Math.abs(sr-tr))
            return 1;
        else 
            return 2;
        
    }
}