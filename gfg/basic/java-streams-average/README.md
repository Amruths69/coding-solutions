# Java Streams Average

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[],**  return the **average** of the array using streams.

 **Note:** Average is sum of all elements divided by the number of elements.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 2.5
Explanation: sum = 1 + 2 + 3 + 4 = 10 and average = 10/4 = 2.5
```

```
Input: arr[] = [3, 2, 1]
Output: 2.0
Explanation: sum = 3 + 2 + 1 = 6 and average = 6/3 = 2.0
```

 **Constraints:** 
1 ≤ arr.length ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T00:56:40.787Z  

```java
class Solution {
    public static double avgUsingStreams(int[] arr) {
        // code here
         return Arrays.stream(arr).average().getAsDouble();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-streams-average/1)