//daily-workout

class Solution {
    public int numberOfSubstrings(String s) {

        int[] count = new int[3];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            // add current character
            count[s.charAt(right) - 'a']++;

            // while window has a,b,c
            while (count[0] > 0 &&
                   count[1] > 0 &&
                   count[2] > 0) {

                // all substrings from right to end are valid
                ans += s.length() - right;

                // remove left character
                count[s.charAt(left) - 'a']--;

                left++;
            }
        }

        return ans;
    }
}