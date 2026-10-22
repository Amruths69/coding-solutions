# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 32.20%)  
**Memory:** 48.2 MB (beats 96.74%)  
**Submitted:** 2026-10-22T23:54:43.004Z  

```java
//daily-dump
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            // Elements immediately to the left and right
            int left1 = (cut1 == 0)
                    ? Integer.MIN_VALUE : nums1[cut1 - 1];

            int right1 = (cut1 == m)
                    ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0)
                    ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right2 = (cut2 == n)
                    ? Integer.MAX_VALUE : nums2[cut2];

            // Check whether the partition is correct
            if (left1 <= right2 && left2 <= right1) {

                // Odd total number of elements
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Even total number of elements
                return ((double) Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }

            // Move binary search boundaries
            else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0.0; // Unreachable for valid inputs
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)