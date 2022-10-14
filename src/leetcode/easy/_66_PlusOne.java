package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;

public class _66_PlusOne {

    public static void main(String[] args) {
        System.out.println("plusOne() = " + plusOne());
    }

    private static int[] plusOne() {
//        int[] digits = {1, 2, 3};
//        int[] digits = {9};
//        int[] digits = {9, 9, 9, 9};
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] digits = {1, 9};
//        int[] digits = {4, 3, 2, 1};

        ArrayList<Integer> al = new ArrayList<>();
        boolean addFlag = true; // 더해야하는지 여부
        boolean allNine = true; // 모든 원소가 9인지 => 자릿수 + 1 해줘야 함
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] == 9 && addFlag) {
                al.add(0);
                continue;
            }
            else {
                allNine = false;
            }
            if (addFlag) {
                al.add(digits[i] + 1);
                addFlag = false;
            }
            else {
                al.add(digits[i]);
            }
        }
        if (allNine) {
            al.add(1);
        }
        Collections.reverse(al);
        return al.stream().mapToInt(Integer::intValue).toArray();
    }

}
