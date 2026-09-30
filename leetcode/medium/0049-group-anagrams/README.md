# Group Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `strs`, group the anagrams together. You can return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  strs = ["eat","tea","tan","ate","nat","bat"]

 **Output:**  [["bat"],["nat","tan"],["ate","eat","tea"]]

 **Explanation:** 

- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

 **Example 2:** 

 **Input:**  strs = [""]

 **Output:**  [[""]]

 **Example 3:** 

 **Input:**  strs = ["a"]

 **Output:**  [["a"]]

 

 **Constraints:** 

- 1 <= strs.length <= 104
- 0 <= strs[i].length <= 100
- strs[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 20 ms (beats 12.48%)  
**Memory:** 50.4 MB (beats 13.83%)  
**Submitted:** 2026-09-30T00:31:16.507Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        int[] a=new int[26];
        HashMap<String,List>hm=new HashMap<>();
        for(String h:strs){
            Arrays.fill(a,0);
            for(char c:h.toCharArray()){
                a[c-'a']++;

            }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append("#");
            sb.append(a[i]);
        }
        String k=sb.toString();
        if(!hm.containsKey(k)){
            hm.put(k,new ArrayList());
        }
        hm.get(k).add(h);
        }
        return new ArrayList(hm.values());
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/group-anagrams/)