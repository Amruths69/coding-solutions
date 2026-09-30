class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++){
                
                if(n==nums[j]){
                    c++;
                }
            }
            hm.put(n,c);
        }
        
        int g=0;
        int[] ans=new int[k];
        
        for(int i=0;i<k;i++){
            int m=0;
            int e=0;
            for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
                if(entry.getValue()>m){
                    m=entry.getValue();
                    e=entry.getKey();

                }
            }
            ans[i]=e;
            hm.remove(e);
        }
        return ans;

        
    }
}