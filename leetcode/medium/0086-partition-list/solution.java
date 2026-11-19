//daily-dump
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode s = small;
        ListNode l = large;

        while(head != null) {
            if(head.val < x) {
                s.next = head;
                s = s.next;
            }
            else {
                l.next = head;
                l = l.next;
            }

            head = head.next;
        }

        l.next = null;
        s.next = large.next;

        return small.next;
    }
}