package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_BinaryTreeInorderTraversal_AGAIN {

    public static void main(String[] args) {
        System.out.println(inorderTraversal());
    }

    private static List<Integer> inorderTraversal() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Stack<Integer> st = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        // 왼 root 오
        return answer;
    }
}
