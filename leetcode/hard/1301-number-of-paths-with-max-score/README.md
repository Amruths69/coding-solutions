# Number of Paths with Max Score

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a square `board` of characters. You can move on the board starting at the bottom right square marked with the character `'S'`.

You need to reach the top left square marked with the character `'E'`. The rest of the squares are labeled either with a numeric character `1, 2,..., 9` or with an obstacle `'X'`. In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.

Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum,  **taken modulo `10^9 + 7`**.

In case there is no path, return `[0, 0]`.

 

 **Example 1:** 

```
Input: board = ["E23","2X2","12S"]
Output: [7,1]

```

 **Example 2:** 

```
Input: board = ["E12","1X1","21S"]
Output: [4,2]

```

 **Example 3:** 

```
Input: board = ["E11","XXX","11S"]
Output: [0,0]

```

 

 **Constraints:** 

- 2 <= board.length == board[i].length <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43.1 MB  
**Submitted:** 2026-07-05T02:38:25.069Z  

```java
//daily-dump
class Solution {
    public int[] pathsWithMaxScore(List<String> board) {

        int n = board.size();
        int mod = 1000000007;

        int[][] score = new int[n][n];
        int[][] ways = new int[n][n];

        // initialize score with -1 (unreachable)
        for (int i = 0; i < n; i++) {
            Arrays.fill(score[i], -1);
        }

        // start from S
        score[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;

        // move from bottom-right to top-left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                char c = board.get(i).charAt(j);

                // obstacle or starting cell already handled
                if (c == 'X' || (i == n - 1 && j == n - 1)) {
                    continue;
                }

                int best = -1;
                int count = 0;

                // from down
                if (i + 1 < n && score[i + 1][j] != -1) {
                    best = score[i + 1][j];
                    count = ways[i + 1][j];
                }

                // from right
                if (j + 1 < n && score[i][j + 1] != -1) {

                    if (score[i][j + 1] > best) {
                        best = score[i][j + 1];
                        count = ways[i][j + 1];
                    } else if (score[i][j + 1] == best) {
                        count = (count + ways[i][j + 1]) % mod;
                    }
                }

                // from diagonal
                if (i + 1 < n && j + 1 < n && score[i + 1][j + 1] != -1) {

                    if (score[i + 1][j + 1] > best) {
                        best = score[i + 1][j + 1];
                        count = ways[i + 1][j + 1];
                    } else if (score[i + 1][j + 1] == best) {
                        count = (count + ways[i + 1][j + 1]) % mod;
                    }
                }

                // unreachable
                if (best == -1) {
                    continue;
                }

                int value = 0;

                // don't add E
                if (c != 'E') {
                    value = c - '0';
                }

                score[i][j] = best + value;
                ways[i][j] = count;
            }
        }

        if (score[0][0] == -1) {
            return new int[]{0, 0};
        }

        return new int[]{score[0][0], ways[0][0]};
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-paths-with-max-score/)