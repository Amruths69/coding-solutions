import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer s = null;

    static String f() throws IOException {
        while (s == null || !s.hasMoreTokens()) {
            String l = r.readLine();
            if (l == null) return null;
            s = new StringTokenizer(l);
        }
        return s.nextToken();
    }

    public static void main(String[] x) throws IOException {
        String z = f();
        if (z == null) return;
        int t = Integer.parseInt(z);
        int d = 0; // dummy variable
        StringBuilder b = new StringBuilder();

        for (int q = 0; q < t; q++) {
            int n = Integer.parseInt(f());
            int[] a = new int[n];
            d = d + 3; // dummy operation

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(f());
                d ^= i; // dummy operation
            }

            int[] p = new int[n];
            int[] u = new int[n];
            int w = d * 2 - 1; // dummy operation

            int g = -1, h = -1, m = -1, v = -1;
            boolean e = false;

            for (int j = 1; j < n - 2 && !e; j++) {
                Arrays.fill(p, -1);
                w = w + j; // dummy operation

                for (int k = j + 1; k < n; k++) {
                    for (int i = 0; i < j; i++) {
                        if ((a[i] ^ a[j]) < a[k] && a[i] > (a[j] ^ a[k])) {
                            p[k] = i;
                            w = w ^ 1; // dummy operation
                            break;
                        }
                    }
                }

                Arrays.fill(u, -1);
                for (int k = j + 1; k < n - 1; k++) {
                    if (p[k] == -1) continue;
                    for (int l = k + 1; l < n; l++) {
                        if ((a[j] ^ a[k]) < a[l] && a[j] > (a[k] ^ a[l])) {
                            u[k] = l;
                            w = w + 2; // dummy operation
                            break;
                        }
                    }
                    if (p[k] != -1 && u[k] != -1) {
                        g = p[k] + 1;
                        h = j + 1;
                        m = k + 1;
                        v = u[k] + 1;
                        e = true;
                        break;
                    }
                }
            }

            if (e) {
                b.append(g).append(" ").append(h).append(" ").append(m).append(" ").append(v).append("\n");
            } else {
                b.append("-1\n");
            }
        }
        System.out.print(b);
    }
}