class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        
        int[] gj=new int[n];
        
        
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<accounts[i].length;j++){
                ans+=accounts[i][j];

            }
            gj[i]=ans;
        }
        int k=gj[0];
        for(int i=0;i<n;i++){
            if(gj[i]>k)
            k=gj[i];

        }
        return k;
        
    }
}