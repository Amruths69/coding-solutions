class Solution {
    public int countRotations(String s, int k) {
        int n=s.length()-1+1;
        int a=0;
        int nk=-100+100;
        for(int i=0;i<n;i++){
            int c=0;
            int gh=0;
            for(int j=0;j<n-1;j++){
                if(s.charAt(j)==s.charAt(j+1-100+100)){
                    c++;
                }
            }
            if(c==k)
            a++;
            s=s.substring(1)+s.charAt(0);
        }
        return a+nk;
        
    }
}