class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        for(int i:nums){
            if(a.contains(i)){
                return true;
            }
            a.add(i);
        }
        return false;
    }
}