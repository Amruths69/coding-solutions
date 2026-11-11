# Missing in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** of size n - 1 containing distinct integers in the range [1, n]. The array represents a permutation of the integers from 1 to n with exactly one element missing.

Find and return the missing element.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

```

```
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
```

```
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:13:28.640Z  

```java
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int c=1;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                c++;
                continue;
            }
            else{
                break;
            }
            
        }
        return c;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1)