package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _119_PascalsTriangle2 {

    public static void main(String[] args) {
        int n = 4;
        List<Integer> res = generate(n);
        for (Integer l : res)
            System.out.print(l+" ");
        System.out.println();
    }

    private static List<Integer> generate(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(List.of(1));
        if (rowIndex == 0) return List.of(1);
        answer.add(List.of(1, 1));
        if (rowIndex == 1) return List.of(1, 1);
        for (int i=2; i<=rowIndex; i++) {
            List<Integer> al = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || j == i) al.add(1);
                else al.add(answer.get(i-1).get(j) + answer.get(i-1).get(j-1));
            }
            answer.add(al);
        }
        return answer.get(rowIndex);
    }


}
