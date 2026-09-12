class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.putIfAbsent(nums[i],new ArrayList<>());
            hm.get((nums[i])).add(i);
            
        }
        int c=0;
        for(List<Integer> i: hm.values()){
            if(i.size()==3){
            int i1=i.get(0);
            int i2=i.get(1);
            int i3=i.get(2);
            if(i2-i1==i3-i2){
                c++;
            }}
        }
        return c;
        
    }
}