# Longest Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string containing just the characters `'('` and `')'`, return  *the length of the longest valid (well-formed) parentheses **substring*.

 

 **Example 1:** 

```
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

```

 **Example 2:** 

```
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

```

 **Example 3:** 

```
Input: s = ""
Output: 0

```

 

 **Constraints:** 

- 0 <= s.length <= 3 * 104
- s[i] is '(', or ')'.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 78.14%)  
**Memory:** 46.6 MB (beats 27.29%)  
**Submitted:** 2026-09-13T00:26:09.922Z  

```java
class Solution {
    public int longestValidParentheses(String s) {
        int mL=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()
                ){
                    st.push(i);
                }else{
                    mL=Math.max(mL,i-st.peek());
                }
            }
        }
        return mL;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-valid-parentheses/)