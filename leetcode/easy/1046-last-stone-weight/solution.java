class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>mxh=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            mxh.add(i);
        }
        while(mxh.size()>1){
            int y=mxh.poll();
            int x=mxh.poll();
            if(x!=y){
                mxh.add(y-x);
            }
        }
        return mxh.isEmpty()?0:mxh.poll();
        
    }
}