import java.util.*;

class Solution {
    public int minMoves(String[] a, int e) {

        int m = a.length;
        int n = a[0].length();

        int sr = 0;
        int sc = 0;

        int[][] l = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(l[i], -1);

            for (int j = 0; j < n; j++) {
                if (a[i].charAt(j) == 'S') {
                    sr = i;
                    sc = j;
                }
            }
        }

        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i].charAt(j) == 'L') {
                    l[i][j] = k++;
                }
            }
        }

        int f = (1 << k) - 1;

        boolean[][][][] v =
            new boolean[m][n][e + 1][1 << k];

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr, sc, e, 0});
        v[sr][sc][e][0] = true;

        int d = 0;

        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int s = q.size();

            while (s-- > 0) {

                int[] x = q.poll();

                int i = x[0];
                int j = x[1];
                int z = x[2];
                int b = x[3];

                if (b == f)
                    return d;

                for (int t = 0; t < 4; t++) {

                    int ni = i + r[t];
                    int nj = j + c[t];

                    if (ni < 0 || ni >= m || nj < 0 || nj >= n)
                        continue;

                    if (a[ni].charAt(nj) == 'X')
                        continue;

                    if (z == 0)
                        continue;

                    int nz = z - 1;

                    if (a[ni].charAt(nj) == 'R')
                        nz = e;

                    int nb = b;

                    if (a[ni].charAt(nj) == 'L')
                        nb |= (1 << l[ni][nj]);

                    if (!v[ni][nj][nz][nb]) {

                        v[ni][nj][nz][nb] = true;

                        q.offer(new int[]{
                            ni, nj, nz, nb
                        });
                    }
                }
            }

            d++;
        }

        return -1;
    }
}