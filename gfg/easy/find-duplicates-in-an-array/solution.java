class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            if(e.getValue()>1){
                al.add(e.getKey());
            }
        }
        return al;
        
    }
}