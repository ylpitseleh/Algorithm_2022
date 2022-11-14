package leetcode.easy;

import java.util.Stack;

public class revision {
    public static void main(String[] args) {
//        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
//        String s = "({[)";
//        String s = "]";
        String s = "(])";
        System.out.println("isValid() = " + isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.add(c);
                continue;
            }
            else if (st.isEmpty()) return false;
            if ((st.peek() == '(' && c == ')') || (st.peek() == '[' && c == ']') || (st.peek() == '{' && c == '}')) st.pop();
            else return false;
        }
        return st.isEmpty()? true: false;
    }
}
