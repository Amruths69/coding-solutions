# WATERCONS - Rating 254

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Water Consumption

Recently, Chef visited his doctor. The doctor advised Chef to drink  **at least**  $2000$ ml of water each day.

Chef drank $X$ ml of water today. Determine if Chef followed the doctor's advice or not.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains one integer $X$ — the amount of water Chef drank today.
### Output Format

For each test case, output `YES` if Chef followed the doctor's advice of drinking at least $2000$ ml of water. Otherwise, output `NO`.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $1 \leq T \leq 2000$
- $1 \le X \le 4000$
### Sample 1:
Input
Output

```
3
2999
1450
2000

```

```
YES
NO
YES

```

### Explanation:

 **Test case $1$:**  Chef followed the doctor's advice since he drank $2999$ ml of water which is $\ge 2000$ ml.

 **Test case $2$:**  Chef did not follow the doctor's advice since he drank $1450$ ml of water which is $\lt 2000$ ml.

 **Test case $3$:**  Chef followed the doctor's advice since he drank $2000$ ml of water which is $\ge 2000$ ml.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T13:59:02.401Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		// write your code here
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WATERCONS)