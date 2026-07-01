//daily-bang
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // must have at least one increase
        if (i == 0 || i == n - 1) {
            return false;
        }

        // decreasing
        int down = i;

        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // must have at least one decrease
        if (i == down || i == n - 1) {
            return false;
        }

        // increasing again
        int up = i;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // must end properly
        return i == n - 1 && up != i;
    }
}