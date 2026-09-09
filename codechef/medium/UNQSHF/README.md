# UNQSHF

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Unequal Shuffle

You are given two strings $A$ and $B$, both of length $N$.
Every character in both strings is either `'a'` or `'b'`.

You are allowed to shuffle the characters of $A$ among themselves.
You are also allowed to shuffle the characters of $B$ among themselves.

Is it possible, after shuffling, to ensure that $A_i \ne B_i$ for  **every**  $1 \le i \le N$?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of three lines of input. The first line of each test case contains a single integer $N$ — the length of the strings. The second line of each test case contains the string $A$ of length $N$. The third line of each test case contains the string $B$ of length $N$.
### Output Format

For each test case, output on a new line the answer: `YES` if the strings can be shuffled to satisfy the condition, and `NO` otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be treated as equivalent.

### Constraints
- $1 \leq T \leq 202$
- $1 \leq N \leq 100$
- $A$ and $B$ contain only the characters a and b.
### Sample 1:
Input
Output

```
4
2
ab
aa
3
abb
baa
4
aabb
baba
4
abba
aaab

```

```
NO
YES
YES
NO

```

### Explanation:

 **Test case $1$:**  We have $A = \texttt{ab}$ and $B = \texttt{aa}$.
$B$ doesn't change value upon shuffling, and $A$ can be made either $\texttt{ab}$ or $\texttt{ba}$.
If $A$ is made into $\texttt{ab}$ then $A_1 = B_1$, while if it's made into $\texttt{ba}$ then $A_2 = B_2$.
So, no solution exists.

 **Test case $2$:**  We have $A = \texttt{abb}$ and $B = \texttt{baa}$. They already satisfy the requisite condition without shuffling.

 **Test case $3$:**  We have $A = \texttt{aabb}$ and $B = \texttt{baba}$. We can turn $A$ into $\texttt{abab}$ and leave $B$ unchanged, and the condition is satisfied.

 **Test case $4$:**  It can be verified that no matter how we shuffle the strings, some index will always contain the same character in both $A$ and $B$, so no solution exists.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T14:45:01.485Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int n=a.nextInt();
		    String aa=a.next();
		    String bb=a.next();
		    int ca=0;
		    int cb=0;
		    for(int i=0;i<n;i++){
		        char g=aa.charAt(i);
		        if(g=='a'){
		            ca++;
		        }
		    }
		    for(int i=0;i<n;i++){
		        char g=bb.charAt(i);
		        if(g=='b'){
		            cb++;
		        }
		    }
		    if(ca==cb){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/UNQSHF)