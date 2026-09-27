class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<m){
                m=prices[i];
            }
            p=Math.max(p,prices[i]-m);
        }
        return p;
        
    }
}