

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        backtrack(s, 0, 0, "", ans);
        return ans;
    }

    void backtrack(String s, int index, int parts,
                   String current, List<String> ans) {

        // Exactly 4 parts and all digits used
        if (parts == 4) {
            if (index == s.length()) {
                ans.add(current.substring(0, current.length() - 1));
            }
            return;
        }

        // Try segments of length 1, 2 and 3
        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length())
                break;

            String part = s.substring(index, index + len);

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0')
                break;

            // Value must not exceed 255
            if (Integer.parseInt(part) > 255)
                break;

            backtrack(s, index + len, parts + 1,
                      current + part + ".", ans);
        }
    }
}

        
