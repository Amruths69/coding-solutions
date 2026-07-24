class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] present = new boolean[2048];

        for (int x : nums) {
            present[x] = true;
        }

        boolean[] pair = new boolean[2048];

        for (int i = 0; i < 2048; i++) {
            if (!present[i]) continue;
            for (int j = 0; j < 2048; j++) {
                if (!present[j]) continue;
                pair[i ^ j] = true;
            }
        }

        boolean[] ans = new boolean[2048];

        for (int x = 0; x < 2048; x++) {
            if (!pair[x]) continue;
            for (int y = 0; y < 2048; y++) {
                if (!present[y]) continue;
                ans[x ^ y] = true;
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;
    }
}