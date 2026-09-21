class Solution {
    public int findMaximumPairs(String s) {
        
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            char r=s.charAt(i);
            char g=s.charAt(i+1);
            if((r == 'x' && g == 'y') || (r == 'y' && g == 'x')){
                c++;
                i++;
            }else{
                continue;
            }
        }
       return c;
    }
}
