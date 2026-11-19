# LJAAS60 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Grades of Student

Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded  **A**  if marks are greater than  **90**,  **B**  if marks are greater than  **70**,  **C**  if greater than or equal to  **40**, else  **F**.

[ **Note:**  You need to take inputs for all 3 students.]

### Sample 1:
Input
Output

```
95  
40  
20  
```

```
A  
C  
F  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:46:22.275Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int a=ac.nextInt();
		if(a>90)System.out.println("A");
		else if(a<90 && a>70)System.out.println("B");
		else if(a<70 && a>=40)System.out.println("C");
		else System.out.println("F");
		int b=ac.nextInt();
		if(b>90)System.out.println("A");
		else if(b<90 && b>70)System.out.println("B");
		else if(b<70 && b>=40)System.out.println("C");
		else System.out.println("F");
		int c=ac.nextInt();
		if(c>90)System.out.println("A");
		else if(c<90 && c>70)System.out.println("B");
		else if(c<70 && c>=40)System.out.println("C");
		else System.out.println("F");
        

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS60)