package leetcode.easy;

import java.util.Stack;

public class _9_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static boolean solve() {
        int x = 10;
//        String s = Integer.toString(x);
//        int idx = s.length()-1;
//        for (int i=0; i<=s.length()/2-1; i++) {
//            if (s.charAt(i) != s.charAt(i+idx)) {
//                return false;
//            }
//            idx -= 2;
//        }

        Stack<Character> st = new Stack();
        String s = Integer.toString(x);
        for(char c : s.toCharArray())
            st.push(c);
        for(int i=s.length()-1; i>=0; i--) {
            if (st.pop() != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

}
