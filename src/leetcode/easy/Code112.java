package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2019-03-19 21:45.
 * 112. 路径总和(https://leetcode-cn.com/problems/path-sum/)
 */
public class Code112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        //如果根结点为null，或左或右结点为空就返回false
        if(root==null)
            return false;
        if(root.left==null&&root.right==null)
            return sum-root.val==0;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }

    public static void main(String[] args) {

    }
}
