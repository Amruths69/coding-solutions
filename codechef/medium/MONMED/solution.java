import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        byte[] buf = new byte[1 << 16];
        int[] ptr = new int[]{0, 0};

        int t = nextInt(in, buf, ptr);
        if (t == -1) return;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in, buf, ptr);
            int[] pos = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int val = nextInt(in, buf, ptr);
                pos[val] = i;
            }

            int k = (n + 1) / 2;

            int[] minPos = new int[k + 1];
            int[] maxPos = new int[k + 1];
            minPos[1] = pos[1];
            maxPos[1] = pos[1];

            for (int i = 2; i <= k; i++) {
                minPos[i] = Math.min(minPos[i - 1], pos[i]);
                maxPos[i] = Math.max(maxPos[i - 1], pos[i]);
            }

            int[] low = new int[k + 1];
            int[] high = new int[k + 1];
            boolean possible = true;

            for (int i = 1; i <= k; i++) {
                low[i] = Math.max(1, maxPos[i] - 2 * i + 2);
                high[i] = Math.min(minPos[i], n - 2 * i + 2);
                if (low[i] > high[i]) {
                    possible = false;
                }
            }

            if (!possible) {
                sb.append("-1\n");
                continue;
            }

            int[] A = new int[k + 1];
            int[] B = new int[k + 1];
            A[k] = 1;
            B[k] = 1;

            for (int i = k; i >= 2; i--) {
                A[i - 1] = Math.max(low[i - 1], A[i]);
                B[i - 1] = Math.min(high[i - 1], B[i] + 2);
                if (A[i - 1] > B[i - 1]) {
                    possible = false;
                    break;
                }
            }

            if (!possible || pos[1] < A[1] || pos[1] > B[1]) {
                sb.append("-1\n");
                continue;
            }

            int[] L = new int[k + 1];
            int[] R = new int[k + 1];
            L[1] = pos[1];
            R[1] = pos[1];

            for (int i = 2; i <= k; i++) {
                L[i] = Math.max(A[i], L[i - 1] - 2);
                R[i] = L[i] + 2 * i - 2;
            }

            for (int i = 1; i <= k; i++) {
                sb.append(L[i]).append(' ').append(R[i]).append('\n');
            }
        }

        System.out.print(sb);
    }

    private static int nextInt(InputStream in, byte[] buf, int[] ptr) throws IOException {
        int c = read(in, buf, ptr);
        while (c <= ' ') {
            if (c == -1) return -1;
            c = read(in, buf, ptr);
        }
        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read(in, buf, ptr);
        }
        return val;
    }

    private static int read(InputStream in, byte[] buf, int[] ptr) throws IOException {
        if (ptr[0] >= ptr[1]) {
            ptr[1] = in.read(buf);
            ptr[0] = 0;
            if (ptr[1] <= 0) return -1;
        }
        return buf[ptr[0]++];
    }
}
