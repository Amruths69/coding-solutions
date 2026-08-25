import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        int multiple = k;

        while (set.contains(multiple)) {
            multiple += k;
        }

        return multiple;
    }
}