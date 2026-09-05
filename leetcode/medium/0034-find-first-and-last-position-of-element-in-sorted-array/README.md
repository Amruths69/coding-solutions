# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.1 MB (beats 51.69%)  
**Submitted:** 2026-09-05T14:16:07.437Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int f = findbound(nums, target, true);

        if (f == -1)
            return new int[]{-1, -1};

        int l = findbound(nums, target, false);

        return new int[]{f, l};
    }

    // isfirst = true  -> find first occurrence
    // isfirst = false -> find last occurrence
    public int findbound(int[] nums, int target, boolean isfirst) {

        int s = 0;
        int e = nums.length - 1;

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (isfirst) {
                    // We found target.
                    // But there may be another target on the left.
                    e = mid - 1;
                }
                else {
                    // We found target.
                    // But there may be another target on the right.
                    s = mid + 1;
                }
            }

            else if (nums[mid] > target) {
                e = mid - 1;
            }

            else {
                s = mid + 1;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)