package leetcode.easy;

import java.util.Stack;

public class _20_ValidParentheses {

    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static boolean solve() {
        String s = "(){";
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
                continue;
            }
            if (!st.isEmpty() && ((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{') || ((c == ']' && st.peek() == '[')))) {
                st.pop();
                continue;
            }
            return false;
        }
        return st.isEmpty();
    }

}
