class MyQueue {
    private Deque<Integer> iS;
    private Deque<Integer> oS;

    public MyQueue() {
        iS = new ArrayDeque<>();
        oS = new ArrayDeque<>();
    }

    public void push(int x) {
        iS.push(x);
    }

    public int pop() {
        mIn();
        return oS.pop();
    }

    public int peek() {
        mIn();
        return oS.peek();
    }

    public boolean empty() {
        return iS.isEmpty() && oS.isEmpty();
    }

    public void mIn() {
        if(oS.isEmpty()) {
            while(!iS.isEmpty()) {
                oS.push(iS.pop());
            }
        }
    }
}