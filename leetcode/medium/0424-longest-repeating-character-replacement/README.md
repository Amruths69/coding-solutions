# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 98.95%)  
**Memory:** 46.4 MB (beats 38.65%)  
**Submitted:** 2026-09-28T00:17:53.904Z  

```java
class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int[] occ=new int[26];
        int r=0;
        int a=0;
        int mc=0;
        for(r=0;r<s.length();r++){
            mc=Math.max(mc,++occ[s.charAt(r)-'A']);
             while (r - l + 1 - mc > k){
            occ[s.charAt(l)-'A']--;
            l++;}
            a=Math.max(a,r-l+1);
        }
        
        return a;

        
    }


}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)