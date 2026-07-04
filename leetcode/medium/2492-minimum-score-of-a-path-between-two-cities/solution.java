class Solution {
    public int minScore(int n, int[][] roads) {

        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] r : roads) {
            int u = r[0];
            int v = r[1];
            int d = r[2];

            graph.get(u).add(new int[]{v, d});
            graph.get(v).add(new int[]{u, d});
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];

        q.offer(1);
        vis[1] = true;

        int ans = Integer.MAX_VALUE;

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int[] nei : graph.get(node)) {

                int next = nei[0];
                int dist = nei[1];

                ans = Math.min(ans, dist);

                if (!vis[next]) {
                    vis[next] = true;
                    q.offer(next);
                }
            }
        }

        return ans;
    }
}