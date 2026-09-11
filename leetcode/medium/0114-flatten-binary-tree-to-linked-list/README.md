# Flatten Binary Tree to Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, flatten the tree into a "linked list":

- The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
- The "linked list" should be in the same order as a pre-order traversal of the binary tree.

 

 **Example 1:** 

```
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

```

 **Example 2:** 

```
Input: root = []
Output: []

```

 **Example 3:** 

```
Input: root = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 2000].
- -100 <= Node.val <= 100

 

 **Follow up:**  Can you flatten the tree in-place (with `O(1)` extra space)?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.9 MB (beats 70.30%)  
**Submitted:** 2026-09-11T00:11:39.599Z  

```java
class Solution {
    public void flatten(TreeNode root) {
        ft(root);
    }

    public TreeNode ft(TreeNode node) {
        if(node == null) {
            return null;
        }

        if(node.left == null && node.right == null) {
            return node;
        }

        TreeNode lt = ft(node.left);
        TreeNode rt = ft(node.right);

        if(lt != null) {
            lt.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rt == null ? lt : rt;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)