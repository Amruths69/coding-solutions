# GROFR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Groups

There are $N$ seats arranged in a row. Each seat is either empty or occupied.

You are given a binary string $S$ of length $N$. A character `0` represents an empty seat, while a character `1` represents an occupied seat.

People sitting in consecutive occupied seats belong to the  **same group**.

For example, in the string `011010`, the occupied seats form two groups: `11` and `1`.

Find the  **total number of groups**.

### Input Format
- The first line contains a single integer $N$ — the number of seats.
- The second line contains a binary string $S$ of length $N$.
### Output Format
- Print a single integer — the number of groups of occupied seats.
### Constraints
- $1 \le N \le 10^5$
- $S_i \in \{0,1\}$
### Sample 1:
Input
Output

```
3
101
```

```
2
```

### Explanation:

The two occupied seats are separated by an empty seat, so they form two different groups.

### Sample 2:
Input
Output

```
10
1001101011
```

```
4
```

### Explanation:

The string is `1001101011`.

The occupied seats form the groups `1`, `11`, `1`, and `11`.

Therefore, the total number of groups is  **4**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T15:50:17.266Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int groupCount = 0;
            boolean inGroup = false;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (!inGroup) {
                        groupCount++;
                        inGroup = true;
                    }
                } else {
                    inGroup = false;
                }
            }
            
            System.out.println(groupCount);
        }
        
       
    }
}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GROFR)