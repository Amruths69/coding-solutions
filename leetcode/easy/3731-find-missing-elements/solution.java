import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        HashSet<Integer> c = new HashSet<>();

        for (int d : nums) {
            a = Math.min(a, d);
            b = Math.max(b, d);
            c.add(d);
        }

        List<Integer> e = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (!c.contains(i)) {
                e.add(i);
            }
        }

        return e;
    }
}