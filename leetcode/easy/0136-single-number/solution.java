class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>i:hm.entrySet()){
            if(i.getValue()==1){
                return i.getKey();
            }
        }
        return -1;
        
    }
}