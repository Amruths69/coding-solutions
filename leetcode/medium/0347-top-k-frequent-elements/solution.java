class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)
        return nums;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        Queue<Integer> h=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int n:m.keySet()){
            h.add(n);
            if(h.size()>k)
            h.poll();
        }
        
    
    int[] ans=new int[k];
    for(int i=0;i<k;i++){
        ans[i]=h.poll();
    }
    return ans;
}}