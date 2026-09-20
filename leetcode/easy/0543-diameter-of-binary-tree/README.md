# Diameter of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the length of the  **diameter**  of the tree*.

The  **diameter**  of a binary tree is the  **length**  of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The  **length**  of a path between two nodes is represented by the number of edges between them.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

```

 **Example 2:** 

```
Input: root = [1,2]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.9 MB (beats 73.71%)  
**Submitted:** 2026-09-20T00:05:30.621Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int md=0;
    public int diameterOfBinaryTree(TreeNode root) {
        gt(root);
        return md;

        
    }
    private int gt(TreeNode node){
        if(node==null)return 0;
        int lh=gt(node.left);
        int rh=gt(node.right);
        md=Math.max(md,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/)