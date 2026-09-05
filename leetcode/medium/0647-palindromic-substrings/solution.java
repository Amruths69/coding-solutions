class Solution {
    public int countSubstrings(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            a+=check(s,i,i);
            a+=check(s,i,i+1);
        }
        return a;

        
    }
    public int check(String s,int l,int r){
        int c=0;
        while(l>=0 && r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            c++;
        }
        return c;
    }
}