class MyDeque {
    Deque<Integer>dq=new ArrayDeque<>();
    public MyDeque() {
        // Initialize your data structure here
        
    }

    public void addFront(int x) {
        dq.addFirst(x);
        // code here
        
    }

    public void addBack(int x) {
        // code here
        dq.addLast(x);
    }

        
    public int removeFront() {
        // code here
        return dq.isEmpty()?-1:dq.removeFirst();
    }
        

    public int removeBack() {
        return dq.isEmpty()?-1:dq.removeLast();
        // code here
        
    }

    public int elementAtFront() {
        // code here
        return dq.isEmpty()? -1:dq.peekFirst();
    }

        
    public int elementAtBack() {
        // code here
        return dq.isEmpty()?-1:dq.peekLast();
    }
        

    public boolean isEmpty() {
        // code here
        return dq.isEmpty();
    }

    public int size() {
        // code here
        return dq.size();
    }
}