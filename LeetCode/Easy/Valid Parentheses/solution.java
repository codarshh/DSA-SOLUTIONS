class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(') {
                top++;
                stack[top] = ')';
            }
            else if (current == '{') {
                top++;
                stack[top] = '}';
            }
            else if (current == '[') {
                top++;
                stack[top] = ']';
            }
            else {
                if (top == -1) {
                    return false;
                }
                if (stack[top] != current) {
                    return false;
                }
                top--;
            }
        }
        if (top == -1) {
            return true;
        }
        return false;
    }
}