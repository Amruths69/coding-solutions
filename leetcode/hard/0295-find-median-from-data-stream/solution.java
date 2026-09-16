class MedianFinder {

    private PriorityQueue<Integer> lo = new PriorityQueue<>((a, b) -> b - a);
    private PriorityQueue<Integer> hi = new PriorityQueue<>();

    public MedianFinder() {
    }
    
    public void addNum(int num) {
        lo.offer(num);
        hi.offer(lo.poll());

        if (lo.size() < hi.size()) {
            lo.offer(hi.poll());
        }
    }
    
    public double findMedian() {
        if (lo.size() > hi.size()) {
            return lo.peek();
        }

        return (lo.peek() + hi.peek()) * 0.5;
    }
}