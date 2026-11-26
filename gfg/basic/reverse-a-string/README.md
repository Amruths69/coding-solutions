# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:02:32.395Z  

```java
class Solution {
    public static String reverseString(String s) {
        // code here
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
            
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)