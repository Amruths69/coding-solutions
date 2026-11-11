# Rotate List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, rotate the list to the right by `k` places.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

```

 **Example 2:** 

```
Input: head = [0,1,2], k = 4
Output: [2,0,1]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 500].
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.9 MB (beats 78.07%)  
**Submitted:** 2026-11-11T00:25:29.189Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)