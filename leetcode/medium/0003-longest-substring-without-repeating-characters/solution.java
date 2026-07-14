//////daily-dump
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> fg = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (fg.contains(s.charAt(right))) {
                fg.remove(s.charAt(left));
                left++;
            }

            fg.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
}