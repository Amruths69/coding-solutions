# Palindromic Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the number of  **palindromic substrings**  in it*.

A string is a  **palindrome**  when it reads the same backward as forward.

A  **substring**  is a contiguous sequence of characters within the string.

 

 **Example 1:** 

```
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

```

 **Example 2:** 

```
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 98.16%)  
**Memory:** 43 MB (beats 55.35%)  
**Submitted:** 2026-09-05T00:34:51.901Z  

```java
class Solution {
    public int countSubstrings(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            a+=check(s,i,i);
            a+=check(s,i,i+1);
        }
        return a;

        
    }
    public int check(String s,int l,int r){
        int c=0;
        while(l>=0 && r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
            c++;
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-substrings/)