package leetcode.easy;

import java.util.HashMap;

public class revision {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"reflower","flow","flight"};
//        String[] strs = {"ab","a"};
//        String[] strs = {"aa", "aa"};
        System.out.println("longestCommonPrefix() = " + longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        String answer = "";
        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (strs[j-1].length() <= i || strs[j].length() <= i || strs[j].charAt(i) != strs[j-1].charAt(i)) {
                    return answer;
                }
            }
            answer += strs[0].substring(i, i+1);
        }
        return answer;
    }
}
