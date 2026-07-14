# Maximum Number of Vowels in a Substring of Given Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and an integer `k`, return  *the maximum number of vowel letters in any substring of* `s` *with length* `k`.

 **Vowel letters**  in English are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

 

 **Example 1:** 

```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

```

 **Example 2:** 

```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

```

 **Example 3:** 

```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 80.21%)  
**Memory:** 46.4 MB (beats 49.88%)  
**Submitted:** 2026-07-14T04:03:49.971Z  

```java
class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            char f=s.charAt(i);
            if(f=='u'||f=='o'||f=='i'||f=='e'||f=='a'){
                c++;
            }
        }
        int m=c;
        for(int i=k;i<s.length();i++){

            if(isVowel(s.charAt(i-k)))
            c--;
            if(isVowel(s.charAt(i)))
            c++;
            m=Math.max(m,c);
        }
        return m;
        
    }
    public boolean isVowel(char f){
        return f=='u'||f=='o'||f=='i'||f=='e'||f=='a';
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)