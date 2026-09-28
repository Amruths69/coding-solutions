class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;

        }
        if(s.length()==1){
            return 1;

        }
        int l=0;
        int r=0;
        int a=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            while(hs.contains(c)){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(c);
            a=Math.max(a,r-l+1);
            r++;
        }
        return a;

        
    }
}