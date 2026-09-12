class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] a=nums;
        Map<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.putIfAbsent(a[i],new ArrayList<>());
            hm.get(a[i]).add(i);
        }
        int c=0;
        for(List<Integer> i:hm.values()){
            if(i.size()>=3){
                int d=i.get(1)-i.get(0);
                boolean iE=true;
                for(int k=2;k<i.size();k++){
                    if(i.get(k)-i.get(k-1)!=d){
                        iE=false;
                        break;
                    }
                }
                if(iE){
                    c++;
                }
            }
        }
        return c;
        
    }
}