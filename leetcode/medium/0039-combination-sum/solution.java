//daily-dump
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        solve(0, candidates, target, list, ans);

        return ans;
    }

    void solve(int index, int[] candidates, int target,
               ArrayList<Integer> list, List<List<Integer>> ans) {

        // Base case: target achieved
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Explore candidates
        for (int i = index; i < candidates.length; i++) {

            // If candidate exceeds target, skip it
            if (candidates[i] > target) continue;

            // Pick
            list.add(candidates[i]);

            // Reuse same candidate allowed
            solve(i, candidates, target - candidates[i], list, ans);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}
