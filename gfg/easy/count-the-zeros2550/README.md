# Count Zeros in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array a **rr**  of only 0's and 1's. The array is **sorted**  in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.

 **Examples:** 

```
Input: arr[] = [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0]
Output: 3
Explanation: There are 3 0's in the given array.
```

```
Input: arr[] = [0, 0, 0, 0, 0]
Output: 5
Explanation: There are 5 0's in the array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T13:51:21.924Z  

```java
class Solution {
    int countZeroes(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }
            
        }
        return c;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-zeros2550/1)