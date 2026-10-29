import java.util.Collections;
class maxPriorityQueue {
    // Initialize your priority queue
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

    public void push(int x) {
        // Insert x into the priority queue
        pq.offer(x);
        
    }

    public int pop() {
        // Remove and return the smallest element
        if(!pq.isEmpty()){
        return pq.poll();}
        return -1;
        
    }

    public int peek() {
        // Return the smallest element, or -1 if empty
        if(!pq.isEmpty()){
        return pq.peek();}else{
            return -1;}
        }
        
    

    public boolean isEmpty() {
        // Check whether the priority queue is empty
        return pq.isEmpty();
    }

    public int size() {
        // Return the size of the priority queue
        return pq.size();
    }
}