# Text Justification

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array of strings `words` and a width `maxWidth`, format the text such that each line has exactly `maxWidth` characters and is fully (left and right) justified.

You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces `' '` when necessary so that each line has exactly `maxWidth` characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left-justified, and no extra space is inserted between words.

 **Note:** 

- A word is defined as a character sequence consisting of non-space characters only.
- Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
- The input array words contains at least one word.

 

 **Example 1:** 

```
Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
```

 **Example 2:** 

```
Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
Output:
[
  "What   must   be",
  "acknowledgment  ",
  "shall be        "
]
Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
Note that the second line is also left-justified because it contains only one word.
```

 **Example 3:** 

```
Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
Output:
[
  "Science  is  what we",
  "understand      well",
  "enough to explain to",
  "a  computer.  Art is",
  "everything  else  we",
  "do                  "
]
```

 

 **Constraints:** 

- 1 <= words.length <= 300
- 1 <= words[i].length <= 20
- words[i] consists of only English letters and symbols.
- 1 <= maxWidth <= 100
- words[i].length <= maxWidth

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 80.09%)  
**Submitted:** 2026-09-05T13:13:02.308Z  

```java
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> a = new ArrayList<>();
        int in = 0;

        while (in < words.length) {

            int c = words[in].length();
            int l = in + 1;

            while (l < words.length) {
                if (c + 1 + words[l].length() > maxWidth)
                    break;

                c += 1 + words[l].length();
                l++;
            }

            StringBuilder b = new StringBuilder();
            b.append(words[in]);

            int dif = l - in - 1;

            // Last line OR only one word
            if (l == words.length || dif == 0) {

                for (int i = in + 1; i < l; i++) {
                    b.append(" ");
                    b.append(words[i]);
                }

                while (b.length() < maxWidth) {
                    b.append(" ");
                }
            }

            else {

                int sp = (maxWidth - c) / dif;
                int es = (maxWidth - c) % dif;

                for (int i = in + 1; i < l; i++) {

                    // Mandatory one space
                    b.append(" ");

                    // Additional evenly distributed spaces
                    for (int s = 0; s < sp; s++) {
                        b.append(" ");
                    }

                    // Remaining extra spaces go to left gaps
                    if (es > 0) {
                        b.append(" ");
                        es--;
                    }

                    b.append(words[i]);
                }
            }

            a.add(b.toString());
            in = l;
        }

        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/text-justification/)