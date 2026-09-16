class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>mnh=new PriorityQueue<>();
        for(int i:nums){
            mnh.add(i);
            if(mnh.size()>k){
                mnh.poll();
            }
        }
        return mnh.peek();
        
    }
}