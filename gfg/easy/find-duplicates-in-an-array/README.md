# Duplicates in Limited Range Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size **n**, containing elements from the range  **1** to **n**, and each element appears at most  **twice**, return an array of all the integers that appears twice.

 **Note:**  You can return the elements in any order but the driver code will print them in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
```

```
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T23:26:51.476Z  

```java
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            if(e.getValue()>1){
                al.add(e.getKey());
            }
        }
        return al;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1)