import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer b = null;

        String line = a.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = a.readLine();
        }
        if (line == null) return;
        b = new StringTokenizer(line);

        int t = Integer.parseInt(b.nextToken());

        while (t-- > 0) {
            while (b == null || !b.hasMoreTokens()) {
                String l = a.readLine();
                if (l == null) break;
                b = new StringTokenizer(l);
            }
            int n = Integer.parseInt(b.nextToken());
            int k = Integer.parseInt(b.nextToken());

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                while (b == null || !b.hasMoreTokens()) {
                    String l = a.readLine();
                    if (l == null) break;
                    b = new StringTokenizer(l);
                }
                v[i] = Integer.parseInt(b.nextToken());
            }

            Arrays.sort(v);

            int take = Math.min(n, k + 1);
            long ans = 0;
            for (int i = n - 1; i >= n - take; i--) {
                ans += v[i];
            }

            System.out.println(ans);
        }
    }
}