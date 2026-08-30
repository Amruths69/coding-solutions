# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 43.64%)  
**Memory:** 44.3 MB (beats 74.62%)  
**Submitted:** 2026-08-30T16:01:57.304Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;

        }
        for(int n:arr){
            if(n!=0)
                return false;
        }
        return true;
        
        }
    }

```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)