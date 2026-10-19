# TRAVELFAST - Rating 571

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Car or Bike

Chef wants to reach home as soon as possible. He has two options:

- Travel with his BIKE which takes $X$ minutes.
- Travel with his CAR which takes $Y$ minutes.

Which of the two options is faster or do they both take same time?

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case contains a single line of input, two integers $X, Y$ representing the time taken to travel with BIKE and CAR respectively.
### Output Format

For each test case, print `CAR` if travelling with Car is faster, `BIKE` if travelling with Bike is faster, `SAME` if they both take the same time.

You may print each character of `CAR`, `BIKE` and `SAME` in uppercase or lowercase (for example, `CAR`, `Car`, `cAr` will be considered identical).

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X,Y \leq 10$
### Sample 1:
Input
Output

```
3
1 5
4 2
6 6

```

```
BIKE
CAR
SAME

```

### Explanation:

 **Test case-1:**  Travelling with `BIKE` takes $1$ minute while travelling with `CAR` takes $5$ minutes. So travelling with `BIKE` is faster.

 **Test case-2:**  Travelling with `BIKE` takes $4$ minutes while travelling with `CAR` takes $2$ minutes. So travelling with `CAR` is faster.

 **Test case-3:**  Travelling with both `BIKE` and `CAR` takes the `SAME` time i.e. $6$ minutes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T23:56:32.609Z  

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
		    int b=a.nextInt();
		    int c=a.nextInt();
		    if(b>c){
		        System.out.println("Car");
		        
		    }else if(c>b){
		        System.out.println("Bike");
    	    }else{
    	        System.out.println("Same");
    	    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TRAVELFAST)