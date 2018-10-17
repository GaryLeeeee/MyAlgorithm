package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-10-16 09:54.
 * 104.二叉树的最大深度（https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/）
 * 递归，有点复杂
 */
public class Code102 {
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right?left+1:right+1;
    }
    //[3,9,20,null,null,15,7]
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.left.left = null;
        treeNode.left.right = null;
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);


        System.out.println(maxDepth(treeNode));
    }
}
