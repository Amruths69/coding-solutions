# UNTTY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Undo the Typos

Sara types on a keyboard that has only lowercase English letters (`a`–`z`) and the `#` key, which works like Backspace.

She starts with an empty text and processes the characters of a string $S$ from left to right:

- A lowercase letter is appended to the end of the current text.
- A # removes the last character of the current text. If the text is already empty, # has no effect.

Find the  **final text**  after all characters of $S$ have been processed.

### Input Format

The only line contains the string $S$.

### Output Format

Print the final text on a single line. If the final text is empty, do not print anything.

### Constraints
- $1 \le |S| \le 10^5$
- $S$ consists only of lowercase English letters and #.
### Sample 1:
Input
Output

```
abc#d##
```

```
a
```

### Explanation:

After typing `abc`, the first `#` removes `c`, leaving `ab`. Typing `d` produces `abd`. The remaining two `#` characters remove `d` and then `b`, leaving `a`.

### Sample 2:
Input
Output

```
abc##de#
```

```
ad
```

### Explanation:

After typing `abc`, the next two `#` characters remove `c` and then `b`, leaving `a`. Typing `de` produces `ade`. The final `#` removes `e`, leaving `ad`.

### Sample 3:
Input
Output

```
#a##b#
```

```
 
```

### Explanation:

The first `#` does nothing because the text is empty. Typing `a` gives `a`, and the next `#` removes it. The second `#` again does nothing on empty text. Typing `b` gives `b`, and the last `#` removes it, leaving the text empty.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T15:42:41.367Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		String s=ac.nextLine();
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)!='#'){
		        st.push(s.charAt(i));
		    }else if(s.charAt(i)=='#'){
		        if(!st.isEmpty()){
		        st.pop();
		    }}
		}
		StringBuilder sb=new StringBuilder();
		for(char i:st){
		    sb.append(i);
		}
		String s1=sb.toString();
		System.out.println(s1);
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/UNTTY)