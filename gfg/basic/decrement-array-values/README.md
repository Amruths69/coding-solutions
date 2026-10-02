# Decrement Array Values by 1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** that contains integers. You need to decrement each element of the array by 1 and return the array.

 **Examples:** 

```
Input: arr[] = [54, 43, 2, 1, 5]
Output: 53 42 1 0 4
Explanation: Just decrement the numbers by 1.
```

```
Input: arr[] = [324, 5, 2, 2]
Output: 323 4 1 1
Explanation: Just decrement the numbers by 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T12:31:30.247Z  

```java
class Solution {
    public static int[] decrementArray(int[] arr, int n) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]--;
        }
        return arr;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decrement-array-values/1)