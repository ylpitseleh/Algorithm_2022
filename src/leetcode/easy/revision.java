package leetcode.easy;

import java.util.HashMap;

public class revision {
    public static void main(String[] args) {
//        String s = "III";
//        String s = "LVIII";
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
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
        int answer = 0;
        for (int i=0; i<s.length(); i++) {
            if (i < s.length()-1) {
                String sub = s.substring(i, i+2);
                if (hm.containsKey(sub)) {
                    answer += hm.get(sub);
                    i++;
                    continue;
                }
            }
            answer += hm.get(s.substring(i, i+1));
        }
        return answer;
    }
}
