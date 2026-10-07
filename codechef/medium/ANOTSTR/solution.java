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

            String u = a.readLine().trim();
            while (u.isEmpty()) {
                u = a.readLine().trim();
            }

            String v = a.readLine().trim();
            while (v.isEmpty()) {
                v = a.readLine().trim();
            }

            int p = (n * 89 + 61) % 1000;
            int q = p ^ n;

            int c = 0;
            int d = 0;

            for (int i = 0; i < n; i++) {
                if (u.charAt(i) == '1') {
                    c++;
                }
                if (v.charAt(i) == '1') {
                    d++;
                }
            }

            if (q == -999999) {
                System.out.print(q);
            }

            if ((c % 2) == (d % 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
