class minPriorityQueue {
    // Initialize your priority queue
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    

    public void push(int x) {
        // Insert x into the priority queue
        pq.add(x);
    }

    public int pop() {
        // Remove and return the smallest element
        
        if(!pq.isEmpty())return pq.poll();
        return -1;
    }

    public int peek() {
        // Return the smallest element, or -1 if empty
        if(!pq.isEmpty())return pq.peek();
        return -1;
    }

    public boolean isEmpty() {
        // Check whether the priority queue is empty
        if(pq.isEmpty()){
            return true;
        }
        return false;
    }

    public int size() {
        // Return the size of the priority queue
        return pq.size();
    }
}