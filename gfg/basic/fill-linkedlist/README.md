# Fill LinkedList

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer LinkedList  **ll**, you are also given a value  **k**. You need to fill arr with k.

 **Examples:** 

```
Input: ll[] = [1, 2, 3, 4, 5], k = 67
Output: 67 67 67 67 67
Explanation: k is 67, so we fill arr with 67.

```

```
Input: ll[] = [7], k = 99
Output: 99
Explanation: k is 99, so we fill arr with 99.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T00:24:49.945Z  

```java
class Solution {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        // Your code here
        for(int i=0;i<ll.size();i++){
            ll.set(i,k);
        
    }
}}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fill-linkedlist/1)