
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        if(a.length<b.length){
            return false;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:b){
            if(!hm.containsKey(i) || hm.get(i)==0){
                return false;
            }
            hm.put(i,hm.get(i)-1);
            
        }
        
        return true;
    }
}
