import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                return true;


            }
            a.add(nums[i]);
            if(a.size()>k)
            a.remove(nums[i-k]);
        }
        return false;
        
       
    }
}