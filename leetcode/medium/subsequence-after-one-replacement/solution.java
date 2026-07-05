class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        String f=s;
        int i=0;
        int j=0;
        int no=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                if(no==0){
                    no++;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
                
                
        }
            no+=(s.length()-i);
            return no<=1;
            
    }
}