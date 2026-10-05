class myQueue {

    int[] arr;
    int f;
    int r;
    int n;
    int size;

    public myQueue(int n) {
        this.n = n;
        arr = new int[n];

        f = 0;
        r = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public void enqueue(int x) {
        if (isFull()) {
            return;
        }

        r = (r + 1) % n;
        arr[r] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        }

        f = (f + 1) % n;
        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return arr[f];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[r];
    }
}