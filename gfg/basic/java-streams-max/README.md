# Java Streams Max

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**, return the **maximum element**  from the array using streams.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 4
Explanation: From the given array, 4 is max.
```

```
Input: arr[] = [3, 2, 1]
Output: 3
Explanation: From the given array, 3 is max.
```

 **Constraints:** 
1 ≤ arr.length ≤ 103
1 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T00:17:43.678Z  

```java
class Solution {
    public static int maxUsingStreams(int[] arr) {
        // code here
        int g=Arrays.stream(arr).max().getAsInt();
        return g;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-streams-max/1)