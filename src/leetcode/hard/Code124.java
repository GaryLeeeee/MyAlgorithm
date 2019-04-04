package leetcode.hard;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2019-04-04 16:49.
 * 124. 二叉树中的最大路径和(
 */
public class Code124 {

    static int maxNum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        max(root);
        return maxNum;
    }

    public static int max(TreeNode root){
        if(root==null)
            return 0;
        int left = Math.max(0,max(root.left));
        int right = Math.max(0,max(root.right));
        maxNum = Math.max(maxNum,root.val+left+right);
        //
        return Math.max(left,right) + root.val;
    }

    public static void main(String[] args) {

    }
}
