# Rank Transform of an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `arr`, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

- Rank is an integer starting from 1.
- The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
- Rank should be as small as possible.

 

 **Example 1:** 

```
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
```

 **Example 2:** 

```
Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

```

 **Example 3:** 

```
Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]

```

 

 **Constraints:** 

- 0 <= arr.length <= 105
- -109 <= arr[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 84.49%)  
**Memory:** 75.3 MB (beats 63.77%)  
**Submitted:** 2026-07-12T03:25:30.074Z  

```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rank-transform-of-an-array/)