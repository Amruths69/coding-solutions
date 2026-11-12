# Unique Binary Search Trees

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of structurally unique  **BST'** s (binary search trees) which has exactly* `n` *nodes of unique values from*  `1`  *to*  `n`.

 

Original
Java
 **Example 1:** 

```
Input: n = 3
Output: 5

```

 **Example 2:** 

```
Input: n = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 19

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.5 MB (beats 88.09%)  
**Submitted:** 2026-11-12T09:56:01.456Z  

```java
//daily-dump
class Solution {
    public int numTrees(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int nodes = 2; nodes <= n; nodes++) {

            for (int root = 1; root <= nodes; root++) {

                int left = root - 1;
                int right = nodes - root;

                dp[nodes] += dp[left] * dp[right];
            }
        }

        return dp[n];
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/unique-binary-search-trees/)