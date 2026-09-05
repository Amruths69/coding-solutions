class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> a = new ArrayList<>();
        int in = 0;

        while (in < words.length) {

            int c = words[in].length();
            int l = in + 1;

            while (l < words.length) {
                if (c + 1 + words[l].length() > maxWidth)
                    break;

                c += 1 + words[l].length();
                l++;
            }

            StringBuilder b = new StringBuilder();
            b.append(words[in]);

            int dif = l - in - 1;

            // Last line OR only one word
            if (l == words.length || dif == 0) {

                for (int i = in + 1; i < l; i++) {
                    b.append(" ");
                    b.append(words[i]);
                }

                while (b.length() < maxWidth) {
                    b.append(" ");
                }
            }

            else {

                int sp = (maxWidth - c) / dif;
                int es = (maxWidth - c) % dif;

                for (int i = in + 1; i < l; i++) {

                    // Mandatory one space
                    b.append(" ");

                    // Additional evenly distributed spaces
                    for (int s = 0; s < sp; s++) {
                        b.append(" ");
                    }

                    // Remaining extra spaces go to left gaps
                    if (es > 0) {
                        b.append(" ");
                        es--;
                    }

                    b.append(words[i]);
                }
            }

            a.add(b.toString());
            in = l;
        }

        return a;
    }
}