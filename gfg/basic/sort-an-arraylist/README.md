# Sort an ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer ArrayList  **arr[]**, sort it in increasing order.

 **Examples:** 

```
Input: arr[] = [9, 8, 7, 6, 5, 4, 4]
Output: [4, 4, 5, 6, 7, 8, 9]
Explanation: After sorting, array will be like [4, 4, 5, 6, 7, 8, 9].
```

```
Input: arr[] = [99, 6, 33]
Output: [6, 33, 99]
Explanation: After sorting, array will be like [6, 33, 99].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T00:14:24.448Z  

```java
import java.util.Collections;


class Solution {
    public static void sortArrayList(ArrayList<Integer> arr) {
        // code here
        arr.sort(null);
       
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-arraylist/1)