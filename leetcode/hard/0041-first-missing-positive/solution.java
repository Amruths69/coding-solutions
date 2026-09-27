class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums){
            hs.add(n);

        }
        int j=1;
        while(hs.contains(j)){
            j++;
        }
        return j;
        
    }
}