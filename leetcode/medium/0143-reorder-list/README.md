# Reorder List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the head of a singly linked-list. The list can be represented as:

```
L0 → L1 → … → Ln - 1 → Ln

```

 *Reorder the list to be on the following form:* 

```
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

```

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4]
Output: [1,4,2,3]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 5 * 104].
- 1 <= Node.val <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 86.86%)  
**Memory:** 49.2 MB (beats 71.56%)  
**Submitted:** 2026-09-10T00:23:11.998Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/reorder-list/)