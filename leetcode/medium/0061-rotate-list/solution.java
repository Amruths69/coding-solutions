
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Step 1: Handle empty list or single node
        if (head == null || head.next == null || k == 0)
            return head;

        // Step 2: Find length and tail
        ListNode tail = head;
        int len = 1;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Step 3: Reduce unnecessary rotations
        k = k % len;

        if (k == 0)
            return head;

        // Step 4: Connect tail to head (circular list)
        tail.next = head;

        // Step 5: Find new tail
        int steps = len - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 6: New head is next of new tail
        ListNode newHead = newTail.next;

        // Step 7: Break the circle
        newTail.next = null;

        return newHead;
    }
}
