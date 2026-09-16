class Solution {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> mxh = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1])
                    - (a[0] * a[0] + a[1] * a[1])
        );

        for (int[] i : points) {

            mxh.add(i);

            if (mxh.size() > k) {
                mxh.poll();
            }
        }

        int[][] re = new int[k][2];

        for (int i = 0; i < k; i++) {
            re[i] = mxh.poll();
        }

        return re;
    }
}