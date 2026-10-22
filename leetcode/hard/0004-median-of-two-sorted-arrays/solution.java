//daily-dump
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            // Elements immediately to the left and right
            int left1 = (cut1 == 0)
                    ? Integer.MIN_VALUE : nums1[cut1 - 1];

            int right1 = (cut1 == m)
                    ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0)
                    ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right2 = (cut2 == n)
                    ? Integer.MAX_VALUE : nums2[cut2];

            // Check whether the partition is correct
            if (left1 <= right2 && left2 <= right1) {

                // Odd total number of elements
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Even total number of elements
                return ((double) Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }

            // Move binary search boundaries
            else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0.0; // Unreachable for valid inputs
    }
}
