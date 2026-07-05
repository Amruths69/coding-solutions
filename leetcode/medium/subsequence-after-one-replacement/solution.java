class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        for(int i=0;i<t.length()-n;i++){
            String sub=t.substring(i,i+n);
            int no=0;
            for(int j=0;j<sub.length();j++){
                if(sub.charAt(j)!=s.charAt(j)){
                    no++;
                }
            }
            if(no<=1){
            return true;
        }
        }
        
        return false;
    }
}