# Remove Duplicates from Sorted List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a sorted linked list,  *delete all duplicates such that each element appears only once*. Return  *the linked list  **sorted**  as well*.

 

 **Example 1:** 

```
Input: head = [1,1,2]
Output: [1,2]

```

 **Example 2:** 

```
Input: head = [1,1,2,3,3]
Output: [1,2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.5 MB (beats 50.79%)  
**Submitted:** 2026-07-02T08:41:09.124Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t=head;
        
        while(t!=null && t.next!=null){
            
            if(t.val==t.next.val){
                t.next=t.next.next;
            }else{
                t=t.next;
            }

        }
        return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)