# Tree: Inorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In this challenge, you are required to implement inorder traversal of a tree. 

Complete the $inOrder$ function in your editor below, which has $1$ parameter: a pointer to the root of a binary tree. It must print the values in the tree's inorder traversal as a single line of space-separated values.  

**Input Format**

Our hidden tester code passes the root node of a binary tree to your $inOrder* function.

**Constraints**

 $1$ $\leq$ $Nodes$ $in$ $the$ $tree$ $\leq$ $500$

**Output Format**

Print the tree's inorder traversal as a single line of space-separated values.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-10T10:14:53.608Z  

```java


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node root) {
          if (root == null) {
            return;
        }

        
        inOrder(root.left);

        
        System.out.print(root.data + " ");

        
        inOrder(root.right);
    }

        

    


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/tree-inorder-traversal/problem)