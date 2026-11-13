# Count Smaller in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an unsorted array  **arr[]**. Find the count of elements less than or equal to the given element  **x**.

 **Examples:** 

```
Input: x = 9, arr[] = [10, 1, 2, 8, 4, 5] 
Output: 5
Explanation: The 5 elements are 1, 2, 8, 4 and 5.

```

```
Input: x = 2, arr[] = [1, 2, 2, 5, 7, 2, 9] 
Output: 4 
Explanation: The 4 elements are 1, 2, 2 and 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T00:59:28.550Z  

```java

class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int t=0;
        for(int i:arr){
            if(i<=x){
                t++;
            }
        }
        return t;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1)