class Solution {

    public void s(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void r(int[] nums, int i) {
        int j = nums.length - 1;

        while (i < j) {
            s(nums, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {

        // 1. Find pivot
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. Find number just greater than pivot
        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            s(nums, i, j);
        }

        // 3. Reverse the part after pivot
        r(nums, i + 1);
    }
}