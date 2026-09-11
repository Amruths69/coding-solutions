class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> mh = new PriorityQueue<>();

        for(ListNode l : lists) {
            while(l != null) {
                mh.add(l.val);
                l = l.next;
            }
        }

        ListNode dum = new ListNode(1);
        ListNode m = dum;

        while(!mh.isEmpty()) {
            m.next = new ListNode(mh.remove());
            m = m.next;
        }

        return dum.next;
    }
}