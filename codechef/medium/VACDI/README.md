# VACDI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vaccine Distribution

A doctor has received a batch of vaccines to treat $N$ infected patients. The strength of each vaccine and the infection level of each patient are represented by two arrays.

You are given an array $V$ of size $N$, where $V_i$ denotes the strength of the $i^{th}$ vaccine, and an array $P$ of size $N$, where $P_i$ denotes the infection level of the $i^{th}$ patient.

Each vaccine can be assigned to  **exactly one**  patient, and each patient must receive  **exactly one**  vaccine.

A patient is cured only if the assigned vaccine has  **strictly greater**  strength than the patient's infection level.

Determine whether it is possible to assign the vaccines so that  **every patient is cured**.

### Input Format
- The first line contains an integer $N$.
- The second line contains $N$ space-separated integers representing the array $V$.
- The third line contains $N$ space-separated integers representing the array $P$.
### Output Format

Print `Yes` if all patients can be cured; otherwise, print `No`.

### Constraints
- $1 \le N \le 10^5$
- $1 \le V_i \le 10^4$
- $1 \le P_i \le 10^4$
### Sample 1:
Input
Output

```
5
123 146 454 542 456
100 328 248 689 200
```

```
No
```

### Explanation:

No assignment of vaccines can cure the patient with infection level $689$, since every available vaccine has strength less than or equal to $689$.

### Sample 2:
Input
Output

```
4
300 200 250 320
120 230 180 270
```

```
Yes
```

### Explanation:

One possible assignment is:

- Vaccine 200 $\rightarrow$ Patient 180
- Vaccine 250 $\rightarrow$ Patient 230
- Vaccine 300 $\rightarrow$ Patient 270
- Vaccine 320 $\rightarrow$ Patient 120

Each assigned vaccine has strictly greater strength than the corresponding patient's infection level.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-27T16:28:59.543Z  

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
		ArrayList<Integer> vac=new ArrayList<>();
		int[] pat=new int[n];
		ArrayList<Boolean> boo=new ArrayList<>();
		
		for(int i=0;i<n;i++){
		    vac.add(a.nextInt());
		    
		}
		for(int i=0;i<n;i++){
		    pat[i]=a.nextInt();
		    
		}
		Collections.sort(vac);
Arrays.sort(pat);
		for(int i=0;i<pat.length;i++){
		    for(int j=0;j<vac.size();j++){
		        if(pat[i]<vac.get(j)){
		            boo.add(true);
		            vac.remove(j);
		            break;
		        }
		    }
		    
		}
		for (int i = 0; i < pat.length; i++) {

    boolean found = false;

    for (int j = 0; j < vac.size(); j++) {
        if (pat[i] < vac.get(j)) {
            found = true;
            vac.remove(j);
            break;
        }
    }

    boo.add(found);
}
		int cf=0;
		for(int i=0;i<boo.size();i++){
		    if (!boo.get(i)) {
    cf++;
}
		}
		if(cf==0){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VACDI)