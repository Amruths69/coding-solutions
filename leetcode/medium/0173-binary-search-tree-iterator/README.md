# Binary Search Tree Iterator

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement the `BSTIterator` class that represents an iterator over the  **in-order traversal**  of a binary search tree (BST):

- BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
- boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
- int next() Moves the pointer to the right, then returns the number at the pointer.

Notice that by initializing the pointer to a non-existent smallest number, the first call to `next()` will return the smallest element in the BST.

You may assume that `next()` calls will always be valid. That is, there will be at least a next number in the in-order traversal when `next()` is called.

 

 **Example 1:** 

```
Input
["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
Output
[null, 3, 7, true, 9, true, 15, true, 20, false]

Explanation
BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
bSTIterator.next();    // return 3
bSTIterator.next();    // return 7
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 9
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 15
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 20
bSTIterator.hasNext(); // return False

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 105].
- 0 <= Node.val <= 106
- At most 105 calls will be made to hasNext, and next.

 

 **Follow up:** 

- Could you implement next() and hasNext() to run in average O(1) time and use O(h) memory, where h is the height of the tree?

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 19.66%)  
**Memory:** 49.3 MB (beats 97.13%)  
**Submitted:** 2026-11-24T15:25:44.237Z  

```java
class BSTIterator {

    Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    public void pushLeft(TreeNode root) {
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode node = st.pop();

        if (node.right != null) {
            pushLeft(node.right);
        }

        return node.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-search-tree-iterator/)