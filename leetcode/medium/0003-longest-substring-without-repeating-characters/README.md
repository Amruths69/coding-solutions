# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 63 ms (beats 55.35%)  
**Memory:** 47.9 MB (beats 42.01%)  
**Submitted:** 2026-09-28T00:30:14.273Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;

        }
        if(s.length()==1){
            return 1;

        }
        int l=0;
        int r=0;
        int a=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            while(hs.contains(c)){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(c);
            a=Math.max(a,r-l+1);
            r++;
        }
        return a;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)