# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 140 ms (beats 11.38%)  
**Memory:** 47 MB (beats 10.73%)  
**Submitted:** 2026-09-27T10:39:18.068Z  

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            if(p(s1,sub)){
                return true;
            }
        }
        return false;
        
    }
    boolean p(String a,String b){
        int[] f=new int[26];
        for(int i=0;i<b.length();i++){
            f[a.charAt(i)-'a']++;
            f[b.charAt(i)-'a']--;
        }
        for(int i:f){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)