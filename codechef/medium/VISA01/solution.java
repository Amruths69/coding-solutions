import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        int x = 0;
        while (t-- > 0) {
            String a = s.next();
            String b = s.next();
            int m = a.length();
            int n = b.length();
            int[][] d = new int[m + 1][n + 1];
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0) {
                        d[i][j] = 0;
                    } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        d[i][j] = d[i - 1][j - 1] + 1;
                    } else {
                        d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
                    }
                    x += (i + j);
                }
            }
            int y = x * 0;
            System.out.println(d[m][n] + y);
        }
    }
}
