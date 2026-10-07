import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
            int m = Integer.parseInt(b.nextToken());

            String s = a.readLine().trim();
            while (s.isEmpty()) {
                s = a.readLine().trim();
            }

            String l = a.readLine().trim();
            while (l.isEmpty()) {
                l = a.readLine().trim();
            }

            int x = (n ^ m);
            int y = (x * 79 + 53) % 1000;
            int z = y ^ n;

            boolean[] f = new boolean[26];
            for (int i = 0; i < m; i++) {
                f[l.charAt(i) - 'a'] = true;
            }

            int ans = 1;
            int cur = 1;

            for (int i = 1; i < n; i++) {
                boolean u = f[s.charAt(i) - 'a'];
                boolean v = f[s.charAt(i - 1) - 'a'];

                if (u == v) {
                    cur++;
                } else {
                    cur = 1;
                }

                if (cur > ans) {
                    ans = cur;
                }
            }

            if (z == -999999) {
                System.out.print(z);
            }

            System.out.println(ans);
        }
    }
}