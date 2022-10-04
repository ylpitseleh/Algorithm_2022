package leetcode.easy;

public class _9_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static boolean solve() {
        int x = -121;
        String s = Integer.toString(x);
        int idx = s.length()-1;
        for (int i=0; i<=s.length()/2-1; i++) {
            if (s.charAt(i) != s.charAt(i+idx)) {
                return false;
            }
            idx -= 2;
        }
        return true;
    }

}
