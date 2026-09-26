# Verifying an Alien Dictionary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different `order`. The `order` of the alphabet is some permutation of lowercase letters.

Given a sequence of `words` written in the alien language, and the `order` of the alphabet, return `true` if and only if the given `words` are sorted lexicographically in this alien language.

 

 **Example 1:** 

```
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

```

 **Example 2:** 

```
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

```

 **Example 3:** 

```
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 20
- order.length == 26
- All characters in words[i] and order are English lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43 MB  
**Submitted:** 2026-09-26T13:39:06.895Z  

```java
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<order.length();i++){
            hm.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words[i].length();j++){
                if(j>=words[i+1].length()){
                    return false;
                }
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    int c=hm.get(words[i].charAt(j));
                    int n=hm.get(words[i+1].charAt(j));
                    if(c>n){
                        return false;

                    }else{
                        break;
                    }
                }
            }
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/verifying-an-alien-dictionary/)