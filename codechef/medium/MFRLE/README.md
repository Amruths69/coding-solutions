# MFRLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Most Frequent Letter

You are given a string $S$ containing uppercase and lowercase English letters, digits, spaces, and special characters.

Only the  **alphabetic characters**  in the string are considered. Letter case is ignored, so uppercase and lowercase forms of the same letter are treated as equal. For example, `A` and `a` represent the same letter.

Find the letter that appears most frequently in $S$.

If multiple letters have the same maximum frequency, choose the one that comes  **first alphabetically**.

Print the answer as a lowercase letter.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single lowercase letter — the most frequent alphabetic character in $S$.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ may contain uppercase and lowercase English letters, digits, spaces, and special characters.
- $S$ contains at least one English alphabetic character.
### Sample 1:
Input
Output

```
Hello, World! 123
```

```
l
```

### Explanation:

Ignoring non-alphabetic characters and letter case, the string becomes `helloworld`.

The letter `l` appears $3$ times, which is more than any other letter.

Therefore, the answer is `l`.

### Sample 2:
Input
Output

```
zzYYxx
```

```
x
```

### Explanation:

After ignoring case, the letters `x`, `y`, and `z` each appear $2$ times.

Since `x` comes first alphabetically, the answer is `x`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T15:33:30.701Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextLine()) {
            String t = s.nextLine();
            int[] a = new int[26];
            int l = t.length() + 100 - 100;
            
            for (int i = 0; i < l; i++) {
                char c = t.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    int v = (c - 'a') + 100 - 100;
                    a[v] = a[v] + 1 + 100 - 100;
                } else if (c >= 'A' && c <= 'Z') {
                    int v = (c - 'A') + 100 - 100;
                    a[v] = a[v] + 1 + 100 - 100;
                }
            }
            
            int m = 0 + 100 - 100;
            char r = 'a';
            
            for (int i = 0; i < 26; i++) {
                if (a[i] > m) {
                    m = a[i] + 100 - 100;
                    int k = i + 'a';
                    r = (char) (k + 100 - 100);
                }
            }
            
            System.out.println(r);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MFRLE)