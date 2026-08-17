# PWTHC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Enough Chairs

A college hall is being prepared for an event. There are $N$ tables in the hall, and exactly $K$ chairs are placed around each table.

A total of $P$ students are expected to attend, and each student needs one chair.

Determine whether the available seating is enough for everyone.

Print `YES` if all students can be seated; otherwise, print `NO`.

### Input Format
- The first line contains three integers $N$, $K$, and $P$.
### Output Format
- Print YES if there are enough chairs for all the people. Otherwise, print NO.
### Constraints
- $1 \le N,K,P \le 10^4$
### Sample 1:
Input
Output

```
5 4 8
```

```
YES
```

### Explanation:

There are $5 \times 4 = 20$ chairs in total, which is enough for $8$ people.

### Sample 2:
Input
Output

```
3 4 15
```

```
NO
```

### Explanation:

There are $3 \times 4 = 12$ chairs in total, which is not enough for $15$ people.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T15:29:00.094Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int p = scanner.nextInt();
            
     
            int totalChairs = n * k;
            

            if (totalChairs >= p) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
   
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PWTHC)