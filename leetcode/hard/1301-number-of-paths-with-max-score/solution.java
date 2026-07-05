//daily-dump
class Solution {
    public int[] pathsWithMaxScore(List<String> board) {

        int n = board.size();
        int mod = 1000000007;

        int[][] score = new int[n][n];
        int[][] ways = new int[n][n];

        // initialize score with -1 (unreachable)
        for (int i = 0; i < n; i++) {
            Arrays.fill(score[i], -1);
        }

        // start from S
        score[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;

        // move from bottom-right to top-left
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                char c = board.get(i).charAt(j);

                // obstacle or starting cell already handled
                if (c == 'X' || (i == n - 1 && j == n - 1)) {
                    continue;
                }

                int best = -1;
                int count = 0;

                // from down
                if (i + 1 < n && score[i + 1][j] != -1) {
                    best = score[i + 1][j];
                    count = ways[i + 1][j];
                }

                // from right
                if (j + 1 < n && score[i][j + 1] != -1) {

                    if (score[i][j + 1] > best) {
                        best = score[i][j + 1];
                        count = ways[i][j + 1];
                    } else if (score[i][j + 1] == best) {
                        count = (count + ways[i][j + 1]) % mod;
                    }
                }

                // from diagonal
                if (i + 1 < n && j + 1 < n && score[i + 1][j + 1] != -1) {

                    if (score[i + 1][j + 1] > best) {
                        best = score[i + 1][j + 1];
                        count = ways[i + 1][j + 1];
                    } else if (score[i + 1][j + 1] == best) {
                        count = (count + ways[i + 1][j + 1]) % mod;
                    }
                }

                // unreachable
                if (best == -1) {
                    continue;
                }

                int value = 0;

                // don't add E
                if (c != 'E') {
                    value = c - '0';
                }

                score[i][j] = best + value;
                ways[i][j] = count;
            }
        }

        if (score[0][0] == -1) {
            return new int[]{0, 0};
        }

        return new int[]{score[0][0], ways[0][0]};
    }
}