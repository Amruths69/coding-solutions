import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static boolean ok(long p, int k) {
        long s = Math.round(Math.sqrt(p));
        for (long x = Math.max(1, s - 2); x <= s + 2; x++) {
            if (Math.abs(p - x * x) <= k) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(int u, int n, int[][] adj, boolean[] vis, int[] match) {
        for (int v : adj[u]) {
            if (!vis[v]) {
                vis[v] = true;
                if (match[v] < 0 || dfs(match[v], n, adj, vis, match)) {
                    match[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

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

            int p = (n * 97 + 67) % 1000;
            int q = p ^ k;

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int m = n / 2;

            boolean[][] valid = new boolean[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i != j && ok((long) i * j, k)) {
                        valid[i][j] = true;
                    }
                }
            }

            int[] pair = new int[n + 1];
            Arrays.fill(pair, -1);
            boolean found = false;

            int skipLimit = (n % 2 == 1) ? n : 0;

            for (int skip = 0; skip <= skipLimit; skip++) {
                if (n % 2 == 0 && skip > 0) break;
                if (n % 2 == 1 && skip == 0) continue;

                int[] rem = new int[2 * m];
                int idx = 0;
                for (int i = 1; i <= n; i++) {
                    if (i != skip) {
                        rem[idx++] = i;
                    }
                }

                // General maximum matching via Blossom algorithm
                int[] mate = new int[n + 1];
                Arrays.fill(mate, 0);

                int matchCount = 0;
                int[] parent = new int[n + 1];
                int[] base = new int[n + 1];
                int[] qArr = new int[n + 1];
                boolean[] inQueue = new boolean[n + 1];
                boolean[] inBlossom = new boolean[n + 1];

                for (int uElem : rem) {
                    if (mate[uElem] != 0) continue;

                    Arrays.fill(parent, 0);
                    Arrays.fill(inQueue, false);
                    for (int i = 1; i <= n; i++) base[i] = i;

                    int head = 0, tail = 0;
                    qArr[tail++] = uElem;
                    inQueue[uElem] = true;
                    int augEnd = 0;

                    while (head < tail) {
                        int curr = qArr[head++];

                        for (int nxt : rem) {
                            if (!valid[curr][nxt] || base[curr] == base[nxt] || mate[curr] == nxt) continue;

                            if (nxt == uElem || (mate[nxt] != 0 && parent[mate[nxt]] != 0)) {
                                // Blossom contraction
                                Arrays.fill(inBlossom, false);
                                int b1 = base[curr], b2 = base[nxt];
                                while (b1 != 0 || b2 != 0) {
                                    if (b1 != 0) {
                                        if (inBlossom[b1]) { b1 = b1; break; }
                                        inBlossom[b1] = true;
                                        b1 = (mate[b1] != 0) ? base[parent[mate[b1]]] : 0;
                                    }
                                    int tmp = b1; b1 = b2; b2 = tmp;
                                }
                                int lca = b1;

                                for (int[] path : new int[][]{{curr, nxt}, {nxt, curr}}) {
                                    int x = path[0], y = path[1];
                                    while (base[x] != lca) {
                                        parent[x] = y;
                                        y = mate[x];
                                        if (!inQueue[y]) {
                                            inQueue[y] = true;
                                            qArr[tail++] = y;
                                        }
                                        base[x] = lca;
                                        base[y] = lca;
                                        x = parent[y];
                                    }
                                }
                            } else if (parent[nxt] == 0) {
                                parent[nxt] = curr;
                                if (mate[nxt] == 0) {
                                    augEnd = nxt;
                                    head = tail;
                                    break;
                                }
                                inQueue[mate[nxt]] = true;
                                qArr[tail++] = mate[nxt];
                            }
                        }
                    }

                    if (augEnd != 0) {
                        int cur = augEnd;
                        while (cur != 0) {
                            int pr = parent[cur];
                            int nxt = mate[pr];
                            mate[cur] = pr;
                            mate[pr] = cur;
                            cur = nxt;
                        }
                        matchCount++;
                    }
                }

                if (matchCount == m) {
                    found = true;
                    int[] ans = new int[n];
                    int pos = 0;
                    boolean[] used = new boolean[n + 1];

                    for (int uElem : rem) {
                        if (!used[uElem]) {
                            int vElem = mate[uElem];
                            used[uElem] = true;
                            used[vElem] = true;
                            ans[pos++] = uElem;
                            ans[pos++] = vElem;
                        }
                    }
                    if (skip != 0) {
                        ans[pos++] = skip;
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.print(ans[i] + (i == n - 1 ? "" : " "));
                    }
                    System.out.println();
                    break;
                }
            }

            if (q == -999999) {
                System.out.print(q);
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}