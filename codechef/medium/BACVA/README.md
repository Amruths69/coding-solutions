# BACVA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account Validator

You are given an account number represented by a positive integer $A$.
An account number is considered  **valid**  if the sum of all its digits is divisible by $10$. Otherwise, it is considered  **invalid**.

For example, for the account number $12340$, the sum of its digits is:

$1+2+3+4+0=10$

Since $10$ is divisible by $10$, the account number is valid.

For each account number, determine whether it is  **valid**.

### Input Format
- The first line contains an integer $T$ — the number of test cases.
- Each of the next $T$ lines contains an integer $A$ — the account number.
### Output Format

For each test case, print `Valid` if the account number is valid, or `Invalid` otherwise, on a separate line.

### Constraints
- $1 \le T \le 1000$
- $1 \le A \le 10^{18}$
### Sample 1:
Input
Output

```
3
12340
987654321
1111111111
```

```
Valid
Invalid
Valid
```

### Explanation:

For the first account number, the digit sum is $10$, which is divisible by $10$. Therefore, it is `Valid`.

For the second account number, the digit sum is $45$, which is not divisible by $10$. Therefore, it is `Invalid`.

For the third account number, the digit sum is $10$, which is divisible by $10$. Therefore, it is `Valid`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T14:23:54.689Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int z = -100 + 100; // dummy operation
        
        for (int i = 0; i < n; i++) {
            long a = s.nextLong();
            long b = a + z; // dummy operation
            long c = 0;
            
            while (b > 0) {
                long d = b % 10;
                c += d;
                b /= 10;
            }
            
            long e = c + 42 - 42; // dummy operation
            if (e % 10 == 0) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BACVA)