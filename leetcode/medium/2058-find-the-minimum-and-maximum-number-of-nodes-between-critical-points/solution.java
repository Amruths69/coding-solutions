class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] a = {-1, -1};

        if (head == null || head.next == null || head.next.next == null) {
            return a;
        }

        ListNode c = head.next;

        int p = head.val;
        int i = 1;

        int f = -1;
        int l = -1;

        int mn = Integer.MAX_VALUE;

        while (c.next != null) {

            int x = c.val;

            if ((x > p && x > c.next.val) ||
                (x < p && x < c.next.val)) {

                if (f != -1) {
                    mn = Math.min(mn, i - l);
                }

                if (f == -1) {
                    f = i;
                }

                l = i;
            }

            p = x;
            c = c.next;
            i++;
        }

        if (f == -1 || f == l) {
            return a;
        }

        int mx = l - f;

        a[0] = mn;
        a[1] = mx;

        return a;
    }
}