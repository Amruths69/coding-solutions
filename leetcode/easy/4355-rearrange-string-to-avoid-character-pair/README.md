# Q1. Rearrange String to Avoid Character Pair

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` and two  **distinct**  lowercase English letters `x` and `y`.

Rearrange the characters of `s` to construct a new string `t` such that:

- t is a permutation of s.
- Every occurrence of y appears before every occurrence of x in t.

Return  **any**  valid string `t`.

A  **permutation**  is a rearrangement of all the characters of a string.

 

 **Example 1:** 

 **Input:**  s = "aabc", x = "a", y = "c"

 **Output:**  "cbaa"

 **Explanation:** 

The string `"cbaa"` is a permutation of `"aabc"`, and every occurrence of `'c'` appears before every occurrence of `'a'`.

 **Example 2:** 

 **Input:**  s = "dcab", x = "d", y = "b"

 **Output:**  "cabd"

 **Explanation:** 

The string `"cabd"` is a permutation of `"dcab"`, and every occurrence of `'b'` appears before every occurrence of `'d'`.

 **Example 3:** 

 **Input:**  s = "axe", x = "o", y = "x"

 **Output:**  "axe"

 **Explanation:** 

The string `"axe"` is already valid. Since `'o'` does not occur in the string, the required condition is automatically satisfied.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of lowercase English letters.
- x and y are lowercase English letters.
- x != y

## Solution

**Language:** Java  
**Runtime:** 4 ms  
**Memory:** 45.3 MB  
**Submitted:** 2026-07-18T15:45:34.306Z  

```java
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==x){
                a.append(ch);
            }else if(ch==y){
                c.append(ch);
            }else{
                b.append(ch);
            }
           
        }
         return(c.toString()+b.toString()+a.toString());
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rearrange-string-to-avoid-character-pair/)