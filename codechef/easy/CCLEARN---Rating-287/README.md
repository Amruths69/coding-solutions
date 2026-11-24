# CCLEARN - Rating 287

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### CodeChef Learn Problem Solving

In the new CodeChef Learn module, under the "Learn Problem Solving" section, there are two courses for each language. For eg. "Python Beginner - Part 1" and "Python Beginner - Part 2". These courses help you get started with CodeChef contests.

Currently there are courses for 4 languages, and hence there are 8 courses in this section. But suppose there are courses for $N$ languages, what will be the total number of courses in this section?

### Input Format

The only line of input will contain a single integer $N$, denoting the number of languages for which there are courses.

### Output Format

Output on a single line the total number of courses in the section.

### Constraints
- $1 \leq N \leq 100$
### Sample 1:
Input
Output

```
4

```

```
8

```

### Explanation:

If there are $4$ languages, then there will be $2 * 4 = 8$ courses in total.

### Sample 2:
Input
Output

```
9

```

```
18

```

### Explanation:

If there are $9$ languages, then there will be $2 * 9 = 18$ courses in total.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T15:27:29.999Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		System.out.println(n*2);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CCLEARN)