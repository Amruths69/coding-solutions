# Most Frequent of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  and two elements  **x**  and  **y**, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one.

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5
Output: 4
Explanation: frequency of 4 is 4.frequency of 5 is 1.Since 4>1 so return 4

```

```
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7
Output: 1
Explanation: frequency of 1 is 1.frequency of 7 is 1.Since 1 < 7, return 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T01:06:12.998Z  

```java
class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int cx=0;
        int cy=0;
        for(int i:arr){
            if(i==x){
                cx++;
            }else if(i==y){
                cy++;
            }
        }
        if(cx>cy){
            return x;
        }else if(cx==cy){
            return Math.min(x,y);
        }else{
            return y; 
        }
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/who-has-the-majority/1)