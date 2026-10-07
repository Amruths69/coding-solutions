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

            String s = a.readLine().trim();
            while (s.isEmpty()) {
                s = a.readLine().trim();
            }

            int p = (n * 83 + 59) % 1000;
            int q = p ^ n;

            int u = 0;
            int d = 0;
            int l = 0;
            int r = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'U') u++;
                else if (c == 'D') d++;
                else if (c == 'L') l++;
                else if (c == 'R') r++;
            }

            int x = r - l;
            int y = u - d;

            boolean ok = false;

            if (x == 2 && y == 0 && r > 0) ok = true;
            else if (x == -2 && y == 0 && l > 0) ok = true;
            else if (x == 0 && y == 2 && u > 0) ok = true;
            else if (x == 0 && y == -2 && d > 0) ok = true;

            if (q == -999999) {
                System.out.print(q);
            }

            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}