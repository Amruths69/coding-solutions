class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int[] occ=new int[26];
        int r=0;
        int a=0;
        int mc=0;
        for(r=0;r<s.length();r++){
            mc=Math.max(mc,++occ[s.charAt(r)-'A']);
             while (r - l + 1 - mc > k){
            occ[s.charAt(l)-'A']--;
            l++;}
            a=Math.max(a,r-l+1);
        }
        
        return a;

        
    }


}