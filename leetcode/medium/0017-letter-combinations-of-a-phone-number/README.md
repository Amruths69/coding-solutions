# Letter Combinations of a Phone Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent. Return the answer in  **any order**.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 

 **Example 1:** 

```
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

```

 **Example 2:** 

```
Input: digits = "2"
Output: ["a","b","c"]

```

 

 **Constraints:** 

- 1 <= digits.length <= 4
- digits[i] is a digit in the range ['2', '9'].

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 87.47%)  
**Submitted:** 2026-11-01T22:49:16.937Z  

```java

class Solution {
    
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    void backtrack(String digits, int index, StringBuilder current) {

        // Base case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Get letters corresponding to current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(digits, index + 1, current);

            // Backtracking
            current.deleteCharAt(current.length() - 1);
        }
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)