# Merge k Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

 *Merge all the linked-lists into one sorted linked-list and return it.* 

 

 **Example 1:** 

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

```

 **Example 2:** 

```
Input: lists = []
Output: []

```

 **Example 3:** 

```
Input: lists = [[]]
Output: []

```

 

 **Constraints:** 

- k == lists.length
- 0 <= k <= 104
- 0 <= lists[i].length <= 500
- -104 <= lists[i][j] <= 104
- lists[i] is sorted in ascending order.
- The sum of lists[i].length will not exceed 104.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 40.61%)  
**Memory:** 46.8 MB (beats 46.24%)  
**Submitted:** 2026-09-11T00:06:10.494Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)