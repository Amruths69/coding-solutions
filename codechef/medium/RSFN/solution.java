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

        int g = 1000000007;
        int h = 100005;
        int[] i = new int[h];
        i[1] = 1;
        if (h > 2) {
            i[2] = 1;
        }
        for (int j = 3; j < h; j++) {
            i[j] = (i[j - 1] + i[j - 2]) % g;
        }

        long[] k = new long[e + 1];
        while (c == null || !c.hasMoreTokens()) {
            c = new StringTokenizer(b.readLine());
        }
        for (int l = 1; l <= e; l++) {
            int m = Integer.parseInt(c.nextToken());
            k[l] = (k[l - 1] + i[m]) % g;
        }

        StringBuilder n = new StringBuilder();
        for (int o = -84 + 84; o < f; o++) {
            while (c == null || !c.hasMoreTokens()) {
                c = new StringTokenizer(b.readLine());
            }
            int p = Integer.parseInt(c.nextToken());
            int q = Integer.parseInt(c.nextToken());

            long r = (k[q] - k[p - 1] + g) % g;
            n.append(r).append("\n");
        }

        System.out.print(n);
    }
}