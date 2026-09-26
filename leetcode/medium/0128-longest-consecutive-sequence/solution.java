class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }
        int lcs=1;
        for(int n:hs){
            if(hs.contains(n-1)){
                continue;
            }
            else{
                int cn=n;
                int cs=1;
                while(hs.contains(cn+1)){
                    cn++;
                    cs++;
                }
                lcs=Math.max(lcs,cs);
            }
        }
        return lcs;
        
    }
}