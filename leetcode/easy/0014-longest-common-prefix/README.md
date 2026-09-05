# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 67.39%)  
**Submitted:** 2026-09-05T00:25:27.638Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
        return "";
        
        String pre=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
                if(pre.isEmpty())
                return "";
            }
        }
        return pre;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)