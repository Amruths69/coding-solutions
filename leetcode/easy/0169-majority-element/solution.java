class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int g=(nums.length)/2;
        for(Map.Entry<Integer,Integer>i:a.entrySet()){
            if(i.getValue()>g){
                return i.getKey();
            }
        }
        return -1;
        
    }
}