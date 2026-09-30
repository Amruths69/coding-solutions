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
**Runtime:** 5 ms (beats 63.75%)  
**Memory:** 44.6 MB (beats 54.89%)  
**Submitted:** 2026-09-30T00:07:26.742Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;

        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)