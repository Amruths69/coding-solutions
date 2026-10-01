# Shortest Unsorted Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr** of distinct numbers. Find the length of the shortest unordered (neither increasing nor decreasing) subarray in the given array. If there is no subarray then return 0.

 **Examples:** 

```
Input: arr[] = [7, 9, 10, 8, 11]
Output: 3
Explanation: Shortest unsorted subarray is 9, 10, 8 which is of 3 elements.
```

```
Input: arr[] = [1, 2, 3, 5]
Output: 0
Explanation: There is no unsorted subarray.
```

 **Constraints:** 
1 <= arr.size() <= 106
1 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T00:27:47.640Z  

```java
class Solution {
    public int shortestUnorderedSubarray(int arr[]) {
        // Code Here
        int c=0;
        int m=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                c++;
            }else if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                c++;
            }
            
            
        }
        
        if(c!=0){
            return 3;
        }else{
            return 0;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/shortest-un-ordered-subarray3634/1)