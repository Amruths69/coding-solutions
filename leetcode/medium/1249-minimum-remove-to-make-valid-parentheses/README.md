# Minimum Remove to Make Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s of `'('`, `')'` and lowercase English characters.

Your task is to remove the minimum number of parentheses (`'('` or `')'`, in any positions) so that the resulting  *parentheses string*  is valid and return  **any**  valid string.

Formally, a  *parentheses string*  is valid if and only if:

- It is the empty string, contains only lowercase characters, or
- It can be written as AB (A concatenated with B), where A and B are valid strings, or
- It can be written as (A), where A is a valid string.

 

 **Example 1:** 

```
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)", "lee(t(c)ode)" would also be accepted.

```

 **Example 2:** 

```
Input: s = "a)b(c)d"
Output: "ab(c)d"

```

 **Example 3:** 

```
Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is either '(', ')', or lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 21.53%)  
**Memory:** 47.5 MB (beats 27.58%)  
**Submitted:** 2026-09-13T00:18:23.356Z  

```java
class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> hm=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    hm.add(i);
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
        hm.add(st.pop());
        }
        StringBuilder r=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!hm.contains(i)){
                r.append(s.charAt(i));
            }
        }
        return r.toString();
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)