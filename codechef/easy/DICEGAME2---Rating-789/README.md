# DICEGAME2 - Rating 789

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Best of Two

Alice and Bob are playing a game. Each player rolls a standard six-sided die three times. The score of a player is calculated as the sum of the two highest rolls. The player with the higher score wins. If both players have the same score, the game ends in a tie.

Determine the winner of the game or if it is a tie.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case contains six space-separated integers $A_1$, $A_2$, $A_3$, $B_1$, $B_2$ and $B_3$ — the values Alice gets in her $3$ dice rolls, followed by the values which Bob gets in his $3$ dice rolls.
### Output Format

For each test case, output on a new line `Alice` if Alice wins, `Bob` if Bob wins and `Tie` in case of a tie.

Note that you may print each character in uppercase or lowercase. For example, the strings `tie`, `TIE`, `Tie`, and `tIe` are considered identical.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq A_1, A_2, A_3, B_1, B_2, B_3 \leq 6$
### Sample 1:
Input
Output

```
3
3 2 5 6 1 1
4 4 5 6 4 1
6 6 6 6 6 1

```

```
Alice
Bob
Tie
```

### Explanation:

 **Test Case $1$:**  Alice's score is $8 = (3 + 5)$ which is greater than Bob's score $7 = (6 + 1)$.

 **Test Case $2$:**  Alice's score is $9 = (5 + 4)$ which is less than Bob's score $10 = (6 + 4)$.

 **Test Case $3$:**  Alice's score is $12 = (6 + 6)$ which is same as Bob's score $12 = (6 + 6)$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T06:11:47.563Z  

```cpp
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
		    int[] arr=new int[3];
		    int[] arr1=new int[3];
		    for(int i=0;i<2;i++){
		        arr[i]=a.nextInt();
		    }for(int j=0;j<2;j++){
		        arr1[j]=a.nextInt();
		    }
		    Arrays.sort(arr);
		    Arrays.sort(arr1);
		    int h=arr[2]+arr[1];
		    int l=arr1[2]+arr1[1];
		    if(h>l){
		        System.out.println("Alice");
		    }else if(h<l){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Tie");
		    }
		    
		}

	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DICEGAME2)