class MinStack {

    private Node head;

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(head == null) {
            head = new Node(value, value, null);
        } else {
            int min = Math.min(value, head.min);
            head = new Node(value, min, head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}