//daily dump
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        int oddCount = 0;

        for (int x : nums1) {
            if (x < minVal) {
                minVal = x;
            }
            if ((x & 1) != 0) {
                oddCount++;
            }
        }

        // Case 1: All elements are already even
        if (oddCount == 0) {
            return true;
        }

        // Case 2: The global minimum is odd
        return (minVal & 1) != 0;
    }
}