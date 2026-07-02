# Left Rotation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A $left\ rotation$ operation on a circular array shifts each of the array's elements $1$ unit to the left. The elements that fall off the left end reappear at the right end. Given an integer $d$, rotate the array that many steps to the left and return the result. 
 

**Example**  
$d=2$  
$arr = [1, 2, 3, 4, 5]$  

After $2$ rotations, $arr' = [3, 4, 5, 1, 2]$.

**Function Description**  

Complete the $rotateLeft$ function with the following parameters:  

- $int\ d$:  the amount to rotate by  
- $int\ arr[n]$: the array to rotate  

**Returns**  

- $int[n]$: the rotated array



**Input Format**

The first line contains two space-separated integers that denote $n$, the number of integers, and $d$, the number of left rotations to perform. 	
The second line contains $n$ space-separated integers that describe $arr[]$.  

**Constraints**

- $1 \le n \le 10^5$  
- $1 \le d \le n$  
- $1 \le a[i] \le 10^6$

**Output Format**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-02T10:20:45.725Z  

```cpp
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> a=new ArrayList<>();
    for(int i=d;i<arr.size();i++){
        a.add(arr.get(i));
    }
    for(int j=0;j<d;j++){
        a.add(arr.get(j));
    }
    return a;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/array-left-rotation/problem)