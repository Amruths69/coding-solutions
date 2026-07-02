# Add Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

 

 **Example 1:** 

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

```

 **Example 2:** 

```
Input: num = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

 

 **Follow up:**  Could you do it without any loop/recursion in `O(1)` runtime?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.8 MB  
**Submitted:** 2026-07-02T03:24:25.473Z  

```java
class Solution {
    public int addDigits(int num) {
        int s=0;
        String g=Integer.toString(num);
        while(num>0){
            int d=num%10;
            s+=d;
            num/=10;
            if(g.length()!=1){
                continue;

            }

        }
        return s;
        
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-digits/)