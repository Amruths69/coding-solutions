//daily-dump
class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        // Base case
        if (head == null) {
            return null;
        }

        // If only one node exists
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        // Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Middle node becomes root
        TreeNode root = new TreeNode(slow.val);

        // Break the linked list into two halves
        prev.next = null;

        // Recursively construct left and right subtrees
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }
}
