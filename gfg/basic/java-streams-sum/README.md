# Java Streams Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**, find the sum of the array using streams.

 **Examples :** 

```
Input: 1 2 3 4
Output: 10
Explanation: 1+2+3+4 = 10
```

```
Input: 3 2 1
Output: 6
Explanation: 3+2+1 = 6
```

 **Constraints:** 
1 <=  **arr.length**  <= 1000
1 <=  **arr[i]**  <= 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T00:13:39.614Z  

```java
class Solution {
    public static int sumUsingStreams(int[] arr) {
        // code here
        return Arrays.stream(arr).sum();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-streams-sum/1)