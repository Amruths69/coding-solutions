class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        
        s=s.trim();
        int n=s.length()-1;
        if(s.length()==1){
            return 1;
        }
        
        for(int i=n;i>0;i--){
            
            if(s.charAt(i)!=' '){
                l++;
            }
            else break;
        }
        return l;
        
    }
}