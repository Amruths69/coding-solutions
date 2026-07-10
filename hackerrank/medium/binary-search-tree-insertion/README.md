# Binary Search Tree : Insertion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a pointer to the root of a binary search tree and values to be inserted into the tree. Insert the values into their appropriate position in the binary search tree and return the root of the updated binary tree.
You just have to complete the function.

**Input Format**

You are given a function,

	Node * insert (Node * root ,int data) {
    
    }
    

**Constraints**

- No. of nodes in the  tree $\le$ 500

**Output Format**

Return the root of the binary search tree after inserting the value into the tree.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-10T10:07:51.254Z  

```java

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
         if (root == null) {
            return new Node(data);
        }

        
        if (data <= root.data) {
            root.left = insert(root.left, data);
        }
        
        else {
            root.right = insert(root.right, data);
        }

        return root;

    	
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem)