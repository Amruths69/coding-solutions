class Solution {
    public int lengthOfLastWord(String s) {
        int t=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)!=' '){
                t++;
            }else if(s.charAt(i)==' ')
            break;

        }
        return t;
        
    }
}