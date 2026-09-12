# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 36.28%)  
**Memory:** 43.2 MB (beats 57.15%)  
**Submitted:** 2026-09-12T00:23:52.818Z  

```java
class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hm.containsKey(c)){
                st.push(c);
            }else{
                if(st.empty())
                return false;
                char te=st.pop();
            if(te!=hm.get(c)){
                return false;
            }
            }
            
        }
        
        return st.isEmpty();
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)