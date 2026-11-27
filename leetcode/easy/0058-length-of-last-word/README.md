# Length of Last Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` consisting of words and spaces, return  *the length of the  **last**  word in the string.* 

A  **word**  is a maximal substring consisting of non-space characters only.

 

Original
Java
 **Example 1:** 

```
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

```

 **Example 2:** 

```
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

```

 **Example 3:** 

```
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only English letters and spaces ' '.
- There will be at least one word in s.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.5 MB  
**Submitted:** 2026-11-27T15:53:13.129Z  

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        
        s=s.trim();
        int n=s.length()-1;
        if(s.length()==1){
            return 1;
        }
        
        for(int i=n;i>0;i--){
            
            if(s.charAt(i)!=' '){
                l++;
            }
            else break;
        }
        return l;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/length-of-last-word/)