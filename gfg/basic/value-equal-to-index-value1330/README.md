# Value Equal to Position

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, find the elements whose value is equal to the position where they appear.

 **Note:**  There can be more than one element in the array which have the same value as its position. You need to include the position of every such element.

 **Examples:** 

```
Input: arr[] = [15, 2, 45, 4, 7]
Output: [2, 4]
Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists.
```

```
Input: arr[] = [1]
Output: [1]
Explanation: Here arr[1] = 1 exists.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T00:01:28.641Z  

```java
class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int s=i+1;
            if(arr[i]==s){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1)