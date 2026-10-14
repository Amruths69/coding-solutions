# Array to Deque

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** containing non-negative integers. You need to insert all elements of the array to deque and return it.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
Explanation: After insert in the deque it will look like [1, 2, 3, 4, 5].

```

```
Input: arr[] = [1]
Output: [1]
Explanation: After insert in the deque it will look like [1].

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T00:03:36.505Z  

```java
class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer>ad=new ArrayDeque<>();
        for(int i=0;i<arr.size();i++){
            ad.addLast(arr.get(i));
        
    }
    return ad;
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-in-deque/1)