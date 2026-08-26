class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();

        // Store positions of all 1s
        int[] ones = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones[count++] = i;
            }
        }

        // Not enough 1s
        if (count < k) {
            return "";
        }

        String ans = "";

        for (int i = 0; i + k - 1 < count; i++) {

            int start = ones[i];
            int end = ones[i + k - 1];

            String curr = s.substring(start, end + 1);

            // First shortest length
            if (ans.equals("") || curr.length() < ans.length()) {
                ans = curr;
            }
            // Same length -> lexicographically smaller
            else if (curr.length() == ans.length() &&
                     curr.compareTo(ans) < 0) {
                ans = curr;
            }
        }

        return ans;
    }
}