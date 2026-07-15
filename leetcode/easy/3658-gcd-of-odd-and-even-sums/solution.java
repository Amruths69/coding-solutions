class Solution {
    public int gcdOfOddEvenSums(int n) {
        int se=0;
        int so=0;
        if(n==1)
        return 1;
        for(int i=1;i<2*n;i++){
            if(i%2==0){
                se+=i;

            }else if(i%2!=0){
                so+=i;
            }
        }
        int max=0;
        int c=0;
        
        for(int i=1;i<so;i++){
            if(so%i==0 && se%i==0){
                c=i;
            }
            max=Math.max(c,max);

        }
        return max;
        
    }
}