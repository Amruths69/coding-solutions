# LinkedList Insertion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**. The task is to insert elements of given array to an LinkedList and return it.

 **Example 1:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 1 2 3 4
Explanation: Simply insert into LL and return it.
```

```
Input: arr[] = [3, 2, 1]
Output: 3 2 1 
Explanation: Simply insert into LL and return it.
```

 **Constraints:** 
1 <= arr.length <= 1000
1 <= arr[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:16:13.562Z  

```java
class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        // Your code here
        LinkedList<Integer>ll=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            ll.add(arr[i]);
        
    }
    return ll;
    
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linkedlist-insertion/1)