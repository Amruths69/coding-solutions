class KthLargest {
     private PriorityQueue<Integer>mnh;
        private int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.mnh=new PriorityQueue<>();
        for(int i:nums){
            add(i);
        }
       

        
    }
    
    public int add(int val) {
        if(mnh.size()<k){
            mnh.offer(val);
        }
        else if(val>mnh.peek()){
            mnh.poll();
            mnh.offer(val);
        }
        return mnh.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */