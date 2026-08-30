class Solution {
    public int countSpecialIntegers(int[] nums) {
        ArrayList<Integer>c=new ArrayList<>();
        for(int i:nums){
            if(c.isEmpty()||c.get(c.size()-1)!=i){
                c.add(i);
            }
        }
        HashMap<Integer,Integer>f=new HashMap<>();
        for(int i:c){
            f.put(i,f.getOrDefault(i,0)+1);
        }
        int sc=0;
        for(int p:f.values()){
            if(p==1)
                sc++;
        }
        return sc;
        
        
    }
}