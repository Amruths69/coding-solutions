# Java Streams Filter

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[],**  return the **maximum odd element.** 

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 3
Explanation: Odd elements are 1, 3. The max is 3.
```

```
Input: arr[] = [3, 2, 1]
Output: 3
Explanation: Odd elements are 3, 1. The max is 3.
```

 **Constraints:** 
1 ≤ arr.length ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:20:38.288Z  

```java
class Solution {
    public static int filterUsingStreams(int[] arr) {
        // code here
        int[] o=Arrays.stream(arr).filter(n->n%2!=0).toArray();
        return Arrays.stream(o).max().getAsInt();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-streams-filter/1)