
class Solution {
    
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    void backtrack(String digits, int index, StringBuilder current) {

        // Base case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Get letters corresponding to current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(digits, index + 1, current);

            // Backtracking
            current.deleteCharAt(current.length() - 1);
        }
    }
}
