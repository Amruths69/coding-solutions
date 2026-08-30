class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(a.containsKey(c)){
                return new int[]{a.get(c),i};}
            a.put(nums[i],i);

        }
        return new int[]{};
        
        

    }
}