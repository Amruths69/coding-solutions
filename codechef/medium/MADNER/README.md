# MADNER

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Dance Partners

Chef is arranging a dance competition for students standing in a row. Their order is represented by a string $S$, where 'x' represents a girl and 'y' represents a boy.

The order of the students cannot be changed.

Each dance pair must contain  **one boy and one girl standing next to each other**. Each student can belong to  **at most one pair**.

Find the  **maximum number of pairs**  that can be formed.

### Input Format
- The first line contains an integer $T$ — the number of test cases.
- Each of the next $T$ lines contains a string $S$.
### Output Format

For each test case, print the maximum number of pairs on a separate line.

### Constraints
- $1 \le T \le 100$
- $1 \le |S| \le 10^5$
- $S$ contains only 'x' and 'y'.
- The sum of $|S|$ over all test cases does not exceed $3 \times 10^5$.
### Sample 1:
Input
Output

```
2
xxyyxy
yyyy
```

```
2
0
```

### Explanation:

 **Test case 1:**  Pair the students at positions $(2,3)$ and $(5,6)$. Each pair contains a boy and a girl. Three pairs are impossible because the student at position $1$ has no adjacent boy.

 **Test case 2:**  All students are boys, so no valid pair can be formed.

### Sample 2:
Input
Output

```
2
yxyxyx
xyyyx
```

```
3
2
```

### Explanation:

 **Test case 1:**  Form pairs at positions $(1,2)$, $(3,4)$, and $(5,6)$. All six students are paired.

 **Test case 2:**  Form pairs at positions $(1,2)$ and $(4,5)$. The student at position $3$ remains unpaired.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T14:28:36.337Z  

```java
class Solution {
    public int findMaximumPairs(String s) {
        Scanner a=new Scanner(System.in);
        String b=a.next();
        int c=0;
        for(int i=0;i<b.length()-1;i++){
            char r=b.charAt(i);
            char g=b.charAt(i+1);
            if(r=='x'||r=='y'&&g=='x'||g=='y'){
                c++;
                r++;
            }else{
                continue;
            }
        }
       return c;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MADNER)