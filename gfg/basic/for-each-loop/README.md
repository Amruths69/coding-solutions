# For-Each Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of integers  **arr[]**. Use a for-each loop to print each integer in the array on a new line.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output:
1
2
3
4
5
Explanation: All integers of the array are printed on a new line using a for-each loop.
```

```
Input: arr[] = [100]
Output:
100
Explanation: The single integer in the array is printed on a new line.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T00:18:45.275Z  

```java
class Solution {
    public void printElements(int[] arr) {
        // code here
        for(int i:arr){
            System.out.println(i);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/for-each-loop/1)