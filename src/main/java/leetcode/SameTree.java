package leetcode;

public class SameTree {
    public boolean same(TreeNode i, TreeNode j){
        if (i==null && j == null){
            return true;
        }
        if (i==null || j == null || i.val != j.val){
            return false;
        }

        return same(i.left,j.left) && same(i.right,j.right);
    }
}
