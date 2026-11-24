class Solution {
    public int sumSqEven(int n) {
        // code here
        int a=0;
        
        for(int i=0;i<=n*2;i+=2){
            if(i%2==0){
                a+=i*i;
            }
        }
        return a;
    }
};