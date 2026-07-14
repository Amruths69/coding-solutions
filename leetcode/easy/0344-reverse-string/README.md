# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.2 MB (beats 74.22%)  
**Submitted:** 2026-07-14T05:45:04.775Z  

```java
class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char c=0;
            c=s[r];
            s[r]=s[l];
            s[l]=c;
            l++;
            r--;



        }
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)