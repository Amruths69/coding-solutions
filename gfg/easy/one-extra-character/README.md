# One Extra Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings **s1**  and **s2**, both containing the same set of characters in any order, except that one of the strings contains exactly one extra character, find and return the extra character. The characters may appear multiple times, and the order of characters in the strings is not necessarily the same.

 **Examples:** 

```
Input: s1 = "abba", s2 = "baxab"
Output: 'x'
Explanation: Both strings contain the characters a, b, b, and a. String s2 has one additional character x.
```

```
Input: s1 = "aaaa", s2 = "aaa"
Output: 'a'
Explanation: Both strings contain the character 'a', but s1 contains it four times while s2 contains it three times. Therefore, the extra character is 'a'.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T01:30:40.132Z  

```java
class Solution {
    public char extraChar(String s1, String s2) {
        // code here
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(char c:s1.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(char c:s2.toCharArray()){
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>e:hm2.entrySet()){
            if(!e.getValue().equals(hm1.getOrDefault(e.getKey(),0))){
                return e.getKey();
            }
        }
        for(Map.Entry<Character,Integer>e:hm1.entrySet()){
            if(!e.getValue().equals(hm2.getOrDefault(e.getKey(),0))){
                return e.getKey();
            }
        }
        return ' ';
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/one-extra-character/1)