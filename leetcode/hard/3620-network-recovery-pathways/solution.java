import java.util.*;

class Solution {

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {

        int n = online.length;

        List<int[]>[] g = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }

        int[] indeg = new int[n];

        int mx = 0;

        for (int[] e : edges) {

            int u = e[0];
            int v = e[1];
            int w = e[2];

            g[u].add(new int[]{v, w});

            indeg[v]++;

            mx = Math.max(mx, w);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {

            int u = q.poll();

            topo.add(u);

            for (int[] e : g[u]) {

                int v = e[0];

                indeg[v]--;

                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }

        int l = 0;
        int r = mx;

        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (ok(mid, g, topo, online, k, n)) {

                ans = mid;

                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return ans;
    }

    boolean ok(int x,
               List<int[]>[] g,
               List<Integer> topo,
               boolean[] online,
               long k,
               int n) {

        long INF = Long.MAX_VALUE / 4;

        long[] dp = new long[n];

        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int u : topo) {

            if (dp[u] == INF) {
                continue;
            }

            if (u != 0 && u != n - 1 && !online[u]) {
                continue;
            }

            for (int[] e : g[u]) {

                int v = e[0];
                int w = e[1];

                if (w < x) {
                    continue;
                }

                if (v != n - 1 && !online[v]) {
                    continue;
                }

                dp[v] = Math.min(dp[v], dp[u] + w);
            }
        }

        return dp[n - 1] <= k;
    }
}