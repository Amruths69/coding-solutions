class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {

                // if stack is empty
                if (top == -1) {
                    return false;
                }

                char popped = stack[top--];

                if ((c == ')' && popped != '(') ||
                    (c == ']' && popped != '[') ||
                    (c == '}' && popped != '{')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}