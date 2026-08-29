# Make Lexicographically Smallest Array by Swapping Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a  **0-indexed**  array of  **positive**  integers `nums` and a  **positive**  integer `limit`.

In one operation, you can choose any two indices `i` and `j` and swap `nums[i]` and `nums[j]`  **if**  `|nums[i] - nums[j]| <= limit`.

Return  *the  **lexicographically smallest array**  that can be obtained by performing the operation any number of times*.

An array `a` is lexicographically smaller than an array `b` if in the first position where `a` and `b` differ, array `a` has an element that is less than the corresponding element in `b`. For example, the array `[2,10,3]` is lexicographically smaller than the array `[10,2,3]` because they differ at index `0` and `2 < 10`.

 

 **Example 1:** 

```
Input: nums = [1,5,3,9,8], limit = 2
Output: [1,3,5,8,9]
Explanation: Apply the operation 2 times:
- Swap nums[1] with nums[2]. The array becomes [1,3,5,9,8]
- Swap nums[3] with nums[4]. The array becomes [1,3,5,8,9]
We cannot obtain a lexicographically smaller array by applying any more operations.
Note that it may be possible to get the same result by doing different operations.

```

 **Example 2:** 

```
Input: nums = [1,7,6,18,2,1], limit = 3
Output: [1,6,7,18,1,2]
Explanation: Apply the operation 3 times:
- Swap nums[1] with nums[2]. The array becomes [1,6,7,18,2,1]
- Swap nums[0] with nums[4]. The array becomes [2,6,7,18,1,1]
- Swap nums[0] with nums[5]. The array becomes [1,6,7,18,1,2]
We cannot obtain a lexicographically smaller array by applying any more operations.

```

 **Example 3:** 

```
Input: nums = [1,7,28,19,10], limit = 3
Output: [1,7,28,19,10]
Explanation: [1,7,28,19,10] is the lexicographically smallest array we can obtain because we cannot apply the operation on any two indices.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109
- 1 <= limit <= 109

## Solution

**Language:** Java  
**Runtime:** 81 ms (beats 74.24%)  
**Memory:** 118 MB (beats 96.97%)  
**Submitted:** 2026-08-29T14:24:57.883Z  

```java
import java.util.*;

public class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] ans = new int[n];
        int i = 0;
        
        while (i < n) {
            int j = i + 1;
            while (j < n && pairs[j][0] - pairs[j - 1][0] <= limit) {
                j++;
            }
            
            List<Integer> idx = new ArrayList<>();
            for (int k = i; k < j; k++) {
                idx.add(pairs[k][1]);
            }
            Collections.sort(idx);
            
            for (int k = 0; k < idx.size(); k++) {
                ans[idx.get(k)] = pairs[i + k][0];
            }
            
            i = j;
        }
        
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/)