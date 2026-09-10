class Solution {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
            return;

        // Find middle
        ListNode s = head;
        ListNode f = head;

        while(f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        // Separate second half
        ListNode second = s.next;
        s.next = null;

        // Reverse second half
        ListNode p = null;
        ListNode c = second;

        while(c != null) {
            ListNode t = c.next;
            c.next = p;
            p = c;
            c = t;
        }

        // Merge
        ListNode f1 = head;
        ListNode s1 = p;

        while(s1 != null) {
            ListNode t = f1.next;
            f1.next = s1;
            f1 = t;

            t = s1.next;
            s1.next = f1;
            s1 = t;
        }
    }
}