package leetcode;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list){
        if (root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }

    public  List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr); // 把左邊的全部先推進去
                curr = curr.left;
            }
            // 當左邊撞到 null 了，從 Stack 拿回最近的那個節點
            curr = stack.pop(); // 回到該位置 彈出位置
            list.add(curr.val);// 記錄數值 (中)
            curr = curr.right;// 轉向右邊
        }
        return list;
    }
}

@RequiredArgsConstructor
@AllArgsConstructor
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
