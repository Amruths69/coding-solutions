class Solution {
    public int[] searchRange(int[] nums, int target) {

        int f = findbound(nums, target, true);

        if (f == -1)
            return new int[]{-1, -1};

        int l = findbound(nums, target, false);

        return new int[]{f, l};
    }

    // isfirst = true  -> find first occurrence
    // isfirst = false -> find last occurrence
    public int findbound(int[] nums, int target, boolean isfirst) {

        int s = 0;
        int e = nums.length - 1;

        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (isfirst) {
                    // We found target.
                    // But there may be another target on the left.
                    e = mid - 1;
                }
                else {
                    // We found target.
                    // But there may be another target on the right.
                    s = mid + 1;
                }
            }

            else if (nums[mid] > target) {
                e = mid - 1;
            }

            else {
                s = mid + 1;
            }
        }

        return ans;
    }
}