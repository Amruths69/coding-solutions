# Unique Number I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **unsorted** array  **arr[]**  of positive integers having all the numbers occurring exactly  **twice**, except for one number which will occur only  **once**. Find the number occurring only once.

 **Examples :** 

```
Input: arr[] = [1, 2, 1, 5, 5]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
```

```
Input: arr[] = [2, 30, 2, 15, 20, 30, 15]
Output: 20
Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T00:44:13.931Z  

```java
class Solution {
    public int findUnique(int[] arr) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>i:hm.entrySet()){
            if(i.getValue()==1){
                return i.getKey();
            }
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-number/1)