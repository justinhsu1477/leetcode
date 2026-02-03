package leetcode;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        // 2. 遞推：問左邊多高
        int left = maxDepth(root.left);
        // 3. 遞推：問右邊多高
        int right = maxDepth(root.right);
        // 4. 回傳：兩邊取最高的，再加上自己這一層
        return Math.max(left,right)+1;
    }
}
