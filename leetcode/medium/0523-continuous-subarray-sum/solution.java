/////daily-dump
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            p += nums[i];

            int r = p % k;

            if (m.containsKey(r)) {
                if (i - m.get(r) >= 2) {
                    return true;
                }
            } else {
                m.put(r, i);
            }
        }

        return false;
    }
}