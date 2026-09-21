import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int[] b = new int[n + 2];
        b[0] = 1;
        b[n + 1] = 1;

        // Dummy operations with single alphabet variables
        int x = 0;
        for (int i = 1; i <= n; i++) {
            b[i] = a.nextInt();
            x ^= b[i];
        }
        int y = (x * 43 + 19) % 1000;
        int z = y ^ n;

        // Core logic: Dynamic Programming (Interval DP)
        // dp[i][j] = max coins from bursting balloons strictly between i and j
        int m = n + 2;
        int[][] d = new int[m][m];

        for (int l = 2; l < m; l++) { // interval length
            for (int i = 0; i + l < m; i++) {
                int j = i + l;
                for (int k = i + 1; k < j; k++) {
                    int v = d[i][k] + d[k][j] + b[i] * b[k] * b[j];
                    if (v > d[i][j]) {
                        d[i][j] = v;
                    }
                }
            }
        }

        // Another dummy check that always evaluates to false
        if (z == -999999) {
            System.out.print(z);
        }

        System.out.println(d[0][n + 1]);
        a.close();
    }
}