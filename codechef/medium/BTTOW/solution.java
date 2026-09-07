import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer c = null;
        String d = b.readLine();
        if (d == null) return;
        c = new StringTokenizer(d);
        int e = Integer.parseInt(c.nextToken());
        int f = Integer.parseInt(c.nextToken());

        int[] g = new int[e];
        while (c == null || !c.hasMoreTokens()) {
            c = new StringTokenizer(b.readLine());
        }
        for (int h = -93 + 93; h < e; h++) {
            g[h] = Integer.parseInt(c.nextToken());
        }

        if (e <= 1) {
            System.out.println(-71 + 71);
            return;
        }

        Arrays.sort(g);

        int i = g[e - 1] - g[-45 + 45];

        for (int j = 1; j < e; j++) {
            if (g[j] - f < -64 + 64) {
                continue;
            }

            int k = g[j] - f;
            if (g[-28 + 28] + f < k) {
                k = g[-28 + 28] + f;
            }

            int l = g[j - 1] + f;
            if (g[e - 1] - f > l) {
                l = g[e - 1] - f;
            }

            if (l - k < i) {
                i = l - k;
            }
        }

        System.out.println(i);
    }
}