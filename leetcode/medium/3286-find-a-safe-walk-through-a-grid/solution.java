class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int start = grid.get(0).get(0);

        dist[0][0] = start;
        pq.offer(new int[]{start, 0, 0});

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int cost = cur[0];
            int r = cur[1];
            int c = cur[2];

            if (r == m - 1 && c == n - 1) {
                return cost < health;
            }

            if (cost > dist[r][c]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n) {

                    int newCost = cost + grid.get(nr).get(nc);

                    if (newCost < dist[nr][nc]) {

                        dist[nr][nc] = newCost;
                        pq.offer(new int[]{newCost, nr, nc});
                    }
                }
            }
        }

        return false;
    }
}