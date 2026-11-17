# Array End Insert

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  that is not completely filled and a value  **val**, you have to insert the value at the end of the array.

**Examples :
**

```
Input: arr[] = [1, 2, 3, 4, 5], val = 90
Output: [1, 2, 3, 4, 5, 90]
Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.
```

```
Input: arr[] = [1, 2, 3], val = 50
Output: [1, 2, 3, 50]
Explanation: After inserting 50 at the end, we have array elements as 1 2 3 50.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T16:06:56.056Z  

```java
class Solution {
    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        // code here
        arr.add(val);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-insert-at-end/1)