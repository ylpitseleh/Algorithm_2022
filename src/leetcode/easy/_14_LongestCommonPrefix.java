package leetcode.easy;

public class _14_LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static String solve() {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"reflower","flow","flight"};
        String[] strs = {"ab","a"};
        // indexOf()를 쓰자..!
        String answer = "";
        boolean breakFlag = false;
        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (i >= strs[j].length() || i >= strs[j-1].length() || strs[j].charAt(i) != strs[j-1].charAt(i)) {
                    breakFlag = true;
                    break;
                }
            }
            if (breakFlag) {
                break;
            }
            answer += Character.toString(strs[0].charAt(i));
        }
        return answer;
    }

}
