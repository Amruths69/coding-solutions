import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static boolean check(int cap, int[] a, int n, int k) {
        int ops = 0;
        int l = 0, r = n - 1;
        while (l <= r) {
            if (a[r] > cap) {
                return false;
            }
            if (l == r) {
                break;
            }
            if (a[l] + a[r] <= cap) {
                ops++;
                l++;
                r--;
            } else {
                r--;
            }
        }
        return ops >= k;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = reader.readLine();
        }
        if (line == null) return;
        tokenizer = new StringTokenizer(line);

        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String l = reader.readLine();
                if (l == null) break;
                tokenizer = new StringTokenizer(l);
            }
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());

            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    String l = reader.readLine();
                    if (l == null) break;
                    tokenizer = new StringTokenizer(l);
                }
                a[i] = Integer.parseInt(tokenizer.nextToken());
                sum += a[i];
            }

            if (k >= n - 1) {
                System.out.println(sum);
                continue;
            }

            Arrays.sort(a);

            int low = a[n - 1];
            int high = sum;
            int ans = sum;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (check(mid, a, n, k)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
