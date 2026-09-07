import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        String[] S1 = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            S1[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(S1, new Comparator<String>() {
            public int compare(String a, String b) {
                String o1 = a + b;
                String o2 = b + a;

                return o2.compareTo(o1);
            }
        });

        if (S1[0].equals("0"))
            return "0";

        StringBuilder ln = new StringBuilder();

        for (String i : S1) {
            ln.append(i);
        }

        return ln.toString();
    }
}