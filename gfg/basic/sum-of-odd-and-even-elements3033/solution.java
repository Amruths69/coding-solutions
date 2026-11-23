class Solution {
    public int[] findSum(int n) {
        // Code here
        int[] ans=new int[2];
        int so=0;
        int se=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)se+=i;
            if(i%2==1)so+=i;
        
    }
    ans[0]=so;
    ans[1]=se;
    return ans;
    }
}