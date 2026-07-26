class Solution {
    public int largestInteger(int n, int s) {
        if(s==0)
            return 0;
        if(9*n<s)
            return -1;
        StringBuilder a=new StringBuilder();
        for(int i=0;i<n;i++){
            int g=Math.min(s,9);
            a.append(g);
            s-=g;
        }
        return Integer.parseInt(a.toString());
        
    }
}