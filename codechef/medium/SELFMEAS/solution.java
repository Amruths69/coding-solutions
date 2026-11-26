import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final long M = 998244353L;

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(b.readLine());

        int t = Integer.parseInt(s.nextToken());
        StringBuilder o = new StringBuilder();

        while (t-- > 0) {
            if (!s.hasMoreTokens()) {
                s = new StringTokenizer(b.readLine());
            }
            int n = Integer.parseInt(s.nextToken());

            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!s.hasMoreTokens()) {
                    s = new StringTokenizer(b.readLine());
                }
                a[i] = Integer.parseInt(s.nextToken());
            }

            long[] d = new long[n + 1];
            d[0] = 1L;

            int[] v = new int[n + 1];
            int[] l = new int[n + 1];
            int z = 0;

            for (int r = 1; r <= n; r++) {
                int x = a[r];
                int p = r - 1;

                while (z > 0 && v[z - 1] <= x) {
                    z--;
                    p = l[z];
                }

                v[z] = x;
                l[z] = p;
                z++;

                long c = 0L;
                for (int i = 0; i < z; i++) {
                    int u = l[i];
                    int w = (i + 1 < z) ? (l[i + 1] - 1) : (r - 1);
                    int k = r - v[i];
                    if (k >= u && k <= w) {
                        c += d[k];
                        if (c >= M) {
                            c -= M;
                        }
                    }
                }
                d[r] = c;
            }

            o.append(d[n]).append('\n');
        }

        System.out.print(o.toString());
    }
}