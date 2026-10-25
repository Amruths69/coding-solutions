# Array Reverse Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  containing  **n**  integers. Print the elements of the array in reverse order on a single line, with a space separating consecutive elements.

 **Examples:** 

```
Input: n = 5, arr[] = [54, 43, 2, 1, 5]
Output: 5 1 2 43 54
Explanation: Just traverse in reverse and print the numbers.
```

```
Input: n = 4, arr[] = [324, 5, 2, 2]
Output: 2 2 5 324
Explanation: Just traverse in reverse and print the numbers.
```

 **Constraints:** 
1≤ n ≤ 10
1 ≤ elements of arr ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:29:09.606Z  

```java
class Solution {
    public static void arrayTraversalReverse(int[] arr, int n) {
        // Code here
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-traversal-reverse/1)