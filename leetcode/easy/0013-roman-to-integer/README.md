# Roman to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9. 
- X can be placed before L (50) and C (100) to make 40 and 90. 
- C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

 **Example 1:** 

```
Input: s = "III"
Output: 3
Explanation: III = 3.

```

 **Example 2:** 

```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

```

 **Example 3:** 

```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

```

 

 **Constraints:** 

- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid roman numeral in the range [1, 3999].

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 31.97%)  
**Memory:** 46.6 MB (beats 36.92%)  
**Submitted:** 2026-08-31T14:28:19.637Z  

```java
class Solution {
    static Map<String,Integer>m=new HashMap<>();
    static{
        m.put("I",1);
        m.put("V",5);
        m.put("X",10);
        m.put("L",50);
        m.put("C",100);
        m.put("D",500);
        m.put("M",1000);
        m.put("IV",4);
        m.put("IX",9);
        m.put("XL",40);
        m.put("XC",90);
        m.put("CD",400);
        m.put("CM",900);
    }
    public int romanToInt(String s) {
        int su=0;
        int i=0;
        while(i<s.length()){
            if( i+ 1 < s.length()){
                String ts=s.substring(i,i+2);
                if(m.containsKey(ts)){
                    su+=m.get(ts);
                    i=i+2;
                    continue;
                }
            }
            String st=s.substring(i,i+1);
            su+=m.get(st);
            i=i+1;
        }
        return su;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/roman-to-integer/)