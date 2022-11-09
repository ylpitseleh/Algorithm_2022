package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {
    public static void main(String[] args) {
//        int n = 5;
        int n = 1;
        List<List<Integer>> res = generate(n);
        for (List<Integer> l : res)
            System.out.println(l);
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(1));
        if (numRows == 1) return answer;
        answer.add(List.of(1, 1));
        if (numRows == 2) return answer;
        for (int i=2; i<numRows; i++) {
            List<Integer> al = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || j == i) al.add(1);
                else al.add(answer.get(i-1).get(j) + answer.get(i-1).get(j-1));
            }
            answer.add(al);
        }
        return answer;
    }

}
