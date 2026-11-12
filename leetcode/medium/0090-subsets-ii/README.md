# Subsets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` that may contain duplicates, return  *all possible*   *subsets** (the power set)*.

The solution set  **must not**  contain duplicate subsets. Return the solution in  **any order**.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [[],[0]]

```

 

 **Constraints:** 

- 1 <= nums.length <= 10
- -10 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 65.32%)  
**Memory:** 44.6 MB (beats 84.42%)  
**Submitted:** 2026-11-12T00:29:59.697Z  

```java

//daily-dump

import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort to bring duplicates together
        backtrack(nums, 0);
        return ans;
    }

    void backtrack(int[] nums, int start) {
        ans.add(new ArrayList<>(curr)); // Add current subset

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate elements at the same level
            if (i > start && nums[i] == nums[i - 1])
                continue;

            curr.add(nums[i]); // Choose

            backtrack(nums, i + 1); // Explore

            curr.remove(curr.size() - 1); // Undo choice
        }
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/subsets-ii/)