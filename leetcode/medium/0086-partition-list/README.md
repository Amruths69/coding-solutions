# Partition List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list and a value `x`, partition it such that all nodes  **less than**  `x` come before nodes  **greater than or equal**  to `x`.

You should  **preserve**  the original relative order of the nodes in each of the two partitions.

 

 **Example 1:** 

```
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

```

 **Example 2:** 

```
Input: head = [2,1], x = 2
Output: [1,2]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 200].
- -100 <= Node.val <= 100
- -200 <= x <= 200

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 65.62%)  
**Submitted:** 2026-11-19T15:14:08.334Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/partition-list/)