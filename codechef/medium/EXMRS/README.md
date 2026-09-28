# EXMRS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Exam Result

Chef has received his exam results. He answered $C$ questions correctly and $W$ questions incorrectly. Each correct answer earns $M$ marks, while each incorrect answer deducts $P$ marks.

Chef needs a final score of  **at least $R$ marks**  to pass. Determine whether he passes the exam. His final score may be negative.

### Input Format

The only line contains five space-separated integers $C$, $M$, $W$, $P$, and $R$.

### Output Format

Print `YES` if Chef passes the exam, otherwise print `NO`.

### Constraints
- $0 \le C,W \le 100$
- $1 \le M,P \le 10$
- $0 \le R \le 1000$
### Sample 1:
Input
Output

```
8 4 2 1 30
```

```
YES
```

### Explanation:

Chef earns $8 \times 4=32$ marks and loses $2 \times 1=2$ marks. His final score is $30$, exactly the required score, so he passes.

### Sample 2:
Input
Output

```
0 4 5 2 0
```

```
NO
```

### Explanation:

Chef earns no marks and loses $5 \times 2=10$ marks. His final score is $-10$, which is below the required score of $0$, so he fails.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T14:57:27.013Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int c=a.nextInt();
		int m=a.nextInt();
		int w=a.nextInt();
		int p=a.nextInt();
		int r=a.nextInt();
        if((c*m)-(w-p)>r){
            System.out.println("Yes");
        }else if((c*m)-(w*p)<r){
            System.out.println("No");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EXMRS)