# Array fill

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, fill the entire array with the value k such that every element of the array becomes equal to k.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4], k = 0
Output: [0, 0, 0, 0]
Explanation: Every element of the array is replaced with 0.
```

```
Input: arr[] = [3, 2, 1], k = 7
Output: [7, 7, 7]
Explanation: Every element of the array is replaced with 7.
```

```
Input: arr[] = [5], k = -2
Output: [-2]
Explanation: The single element in the array is replaced with -2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:30:02.380Z  

```java
class Solution {
    public void fillArray(int[] arr, int k) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]=k;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/vector-fill/1)