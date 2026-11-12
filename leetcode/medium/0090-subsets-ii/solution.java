
//daily-dump

import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort to bring duplicates together
        backtrack(nums, 0);
        return ans;
    }

    void backtrack(int[] nums, int start) {
        ans.add(new ArrayList<>(curr)); // Add current subset

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate elements at the same level
            if (i > start && nums[i] == nums[i - 1])
                continue;

            curr.add(nums[i]); // Choose

            backtrack(nums, i + 1); // Explore

            curr.remove(curr.size() - 1); // Undo choice
        }
    }
}
