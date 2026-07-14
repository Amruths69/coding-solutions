////daily-dump
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            // Skip non-alphanumeric characters from the left
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // Skip non-alphanumeric characters from the right
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));

            if (left != right) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}