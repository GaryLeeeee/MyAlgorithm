package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2019-04-04 18:39.
 * 111. 二叉树的最小深度(https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/)
 */
public class Code111 {
    public static int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return minDepth(root.left)+1;

        //如果左右结点均有空才返回值
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        System.out.println(minDepth(treeNode));
    }
}
