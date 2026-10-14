# ArrayList insertion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  containing integers. The task is to insert elements of given array to an  **ArrayList** and return that ArrayList.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 1 2 3 4
Explanation: Simply insert into ArrayList and return it.
```

```
Input: arr[] = [3, 2, 1]
Output: 3 2 1 
Explanation: Simply insert into ArrayList and return it.
```

 **Constraints:** 
1  <=  arr.length  <=  1000
1  <=  arr[i]  <=  1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T00:26:45.769Z  

```java
class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/arraylist-insertion/1)