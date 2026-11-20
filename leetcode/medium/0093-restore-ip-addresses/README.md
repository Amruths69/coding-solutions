# Restore IP Addresses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A  **valid IP address**  consists of exactly four integers separated by single dots. Each integer is between `0` and `255` (**inclusive**) and cannot have leading zeros.

- For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.

Given a string `s` containing only digits, return  *all possible valid IP addresses that can be formed by inserting dots into* `s`. You are  **not**  allowed to reorder or remove any digits in `s`. You may return the valid IP addresses in  **any**  order.

 

Original
Java
 **Example 1:** 

```
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]

```

 **Example 2:** 

```
Input: s = "0000"
Output: ["0.0.0.0"]

```

 **Example 3:** 

```
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]

```

 

 **Constraints:** 

- 1 <= s.length <= 20
- s consists of digits only.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 39.40%)  
**Memory:** 43.4 MB (beats 79.15%)  
**Submitted:** 2026-11-20T15:51:41.129Z  

```java


class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s, 0, 0, "", ans);
        return ans;
    }

    void backtrack(String s, int index, int parts,
                   String current, List<String> ans) {

        // Exactly 4 parts and all digits used
        if (parts == 4) {
            if (index == s.length()) {
                ans.add(current.substring(0, current.length() - 1));
            }
            return;
        }

        // Try segments of length 1, 2 and 3
        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length())
                break;

            String part = s.substring(index, index + len);

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0')
                break;

            // Value must not exceed 255
            if (Integer.parseInt(part) > 255)
                break;

            backtrack(s, index + len, parts + 1,
                      current + part + ".", ans);
        }
    }
}

        

```

---

[View on LeetCode](https://leetcode.com/problems/restore-ip-addresses/)