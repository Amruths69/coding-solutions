class Solution {
    static boolean isPerfect(int n) {
        // code here
        int pn=0;
        int s=(int)Math.sqrt(n);
        for(int i=1;i<=s;i++){
            if(n%i==0){pn+=i;
            if (i != n/i && i != 1) {
                                pn += n/i;
                            }
        }}
        return pn==n;
        
    }
};