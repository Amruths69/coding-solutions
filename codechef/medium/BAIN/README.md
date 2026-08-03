# BAIN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Balanced Ingredients

Chef is preparing a special dish using four ingredients. Each ingredient has an integer value representing how it affects the taste of the dish.

The values of the four ingredients are $a$, $b$, $c$, and $d$, and no two ingredients have the same value.

Chef may choose any  **non-empty subset**  of these ingredients. A selection is considered balanced if the sum of the values of the chosen ingredients is exactly $0$.

Determine whether Chef can make a balanced selection.

 **A** non-empty subset** must contain at least one ingredient. For example, $\{a\}$, $\{a,c\}$, and $\{a,b,d\}$ are non-empty subsets, while $\{\}$ is an empty subset and cannot be chosen.

### Input Format

The only line contains four space-separated integers $a$, $b$, $c$, and $d$.

### Output Format

Print `Yes` if there exists a non-empty subset of $\{a,b,c,d\}$ whose sum is $0$. Otherwise, print `No`.

### Constraints
- $-10^6 \le a,b,c,d \le 10^6$
- $a$, $b$, $c$, and $d$ are pairwise distinct.
### Sample 1:
Input
Output

```
7 -3 5 -9
```

```
Yes
```

### Explanation:

Chef can choose the ingredients with values $7$, $-3$, and $5$, along with the ingredient with value $-9$.

Their sum is:

$$ 7+(-3)+5+(-9)=0 $$

Therefore, Chef can make a balanced selection.

### Sample 2:
Input
Output

```
2 5 8 11
```

```
No
```

### Explanation:

All four ingredient values are positive. Therefore, the sum of every non-empty subset is greater than $0$.

Hence, Chef cannot make a balanced selection.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T14:49:31.313Z  

```py
# cook your dish here

```

---

[View on CodeChef](https://www.codechef.com/problems/BAIN)