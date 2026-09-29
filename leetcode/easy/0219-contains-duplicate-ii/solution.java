class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(hs.contains(i)){
            return true;
        }
        hs.add(i);
        if(hs.size()>k){
            hs.remove(nums[i-k]);
        }
       }
       return false;
}
}