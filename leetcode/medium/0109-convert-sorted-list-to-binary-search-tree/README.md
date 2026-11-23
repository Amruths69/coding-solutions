# Convert Sorted List to Binary Search Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a singly linked list where elements are sorted in  **ascending order**, convert  *it to a   height-balanced binary search tree*.

 

 **Example 1:** 

```
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

```

 **Example 2:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in head is in the range [0, 2 * 104].
- -105 <= Node.val <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.4 MB (beats 78.27%)  
**Submitted:** 2026-11-23T15:21:26.535Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)