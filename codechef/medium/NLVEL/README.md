# NLVEL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Next Level

Chef is playing a video game and has collected $X$ stars. He needs  **at least $60$ stars**  to unlock the next level.

Determine whether Chef can unlock the next level.

### Input Format

The only line contains an integer $X$ — the number of stars Chef has collected.

### Output Format

Print `YES` if Chef can unlock the next level, otherwise print `NO`.

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings `NO`, `no`, `No`, and `nO` will all be treated as equivalent.

### Constraints
- $1 \leq X \leq 100$
### Sample 1:
Input
Output

```
45
```

```
No
```

### Explanation:

Chef has $45$ stars, which is fewer than the required $60$ stars.

### Sample 2:
Input
Output

```
80
```

```
Yes
```

### Explanation:

Chef has $80$ stars, which is more than the required $60$ stars.

### Sample 3:
Input
Output

```
60

```

```
Yes

```

### Explanation:

Chef has $60$ stars, which is equal to the required $60$ stars.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T14:18:03.554Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
	    System.out.println(n>60?"Yes":"No");

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NLVEL)