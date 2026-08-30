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
**Runtime:** 21 ms (beats 9.43%)  
**Memory:** 50.4 MB (beats 13.56%)  
**Submitted:** 2026-08-30T16:33:53.672Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();

        }
        HashMap<String,List<String>>a=new HashMap<>();
        int[] arr=new int[26];
        for(String s: strs){
            Arrays.fill(arr,0);
            for(int j=0;j<s.length();j++){
                arr[s.charAt(j)-'a']++;

            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                sb.append("#");
                sb.append(arr[i]);
            }
            String k=sb.toString();
            if(!a.containsKey(k)){
                a.put(k, new ArrayList<>());

            }
            a.get(k).add(s);
        
        }
        return new ArrayList(a.values());
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/group-anagrams/)