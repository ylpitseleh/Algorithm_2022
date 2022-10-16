package leetcode.easy;

import java.util.Stack;

public class _20_ValidParentheses {

    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static boolean solve() {
        String s = "()";
//        Stack<Character> st = new Stack<>();
//        if (s.length() % 2 != 0) return false;
//        for(char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                st.push(c);
//                continue;
//            }
//            if (!st.isEmpty() && ((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{') || ((c == ']' && st.peek() == '[')))) {
//                st.pop();
//                continue;
//            }
//            return false;
//        }
//        return st.isEmpty();

        // 스택에 (가 나오면 )을 넣고 c가 )이 아니면 false
        // 베끼다시피 풀긴했다만 나중에 기억못할듯
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }

}
