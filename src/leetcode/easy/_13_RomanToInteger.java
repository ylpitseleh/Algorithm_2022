package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {

    public static void main(String[] args) {
        System.out.println("solve() = " + solve());
    }

    private static int solve() {
        String s = "MCMXCIV";
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        hm.put("IV", 4);
        hm.put("IX", 9);
        hm.put("XL", 40);
        hm.put("XC", 90);
        hm.put("CD", 400);
        hm.put("CM", 900);

        int idx = 0;
        while (idx < s.length()) {
            if (idx + 2 <= s.length()) {
                String twoLen = s.substring(idx, idx + 2); // IV, IX 이런 경우
                if (hm.containsKey(twoLen)) {
                    answer += hm.get(twoLen);
                    idx += 2;
                    continue;
                }
            }
            answer += hm.get(s.substring(idx, idx+1));
            idx++;
        }
        return answer;
    }

}
