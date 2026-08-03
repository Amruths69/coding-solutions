# SNCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Equal Chocolates

Chef buys $A$ boxes of the first type, with each box containing $X$ chocolates.

Chef also buys $B$ boxes of the second type, with each box containing $Y$ chocolates.

Determine whether the total number of chocolates bought from the first type of boxes is equal to the total number bought from the second type.

Print `YES` if the two totals are equal. Otherwise, print `NO`.

### Input Format

The first line contains four space-separated integers $A$, $X$, $B$, and $Y$.

### Output Format

Print `YES` if the total number of chocolates from both types of boxes is equal. Otherwise, print `NO`

### Constraints
- $1 \le A,X,B,Y \le 100$
### Sample 1:
Input
Output

```
2 5 1 10
```

```
YES
```

### Explanation:

The first type of boxes contains:

$$ 2 \times 5 = 10 $$

chocolates in total.

The second type of boxes contains:

$$ 1 \times 10 = 10 $$

chocolates in total.

Since both totals are equal, the answer is `YES`.

### Sample 2:
Input
Output

```
3 4 2 5
```

```
NO
```

### Explanation:

The first type of boxes contains:

$$ 3 \times 4 = 12 $$

chocolates in total.

The second type of boxes contains:

$$ 2 \times 5 = 10 $$

chocolates in total.

Since the totals are not equal, the answer is `NO`.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T14:42:15.227Z  

```py
# cook your dish here
a,x,b,y=map(int,input().split())
if (a*x)==(b*y):
    print("yes")
else:
    print("no")


```

---

[View on CodeChef](https://www.codechef.com/problems/SNCO)