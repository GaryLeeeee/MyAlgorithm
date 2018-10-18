package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-10-16 09:54.
 * 104.二叉树的最大深度（https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/）
 * 递归，有点复杂
 */
public class Code104 {
    //二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    //说明: 叶子节点是指没有子节点的节点。
    public static int maxDepth(TreeNode root) {
        //如果当前TreeNode为null,则父节点为叶子节点(没有子节点),which长度为1,然后一个个往前推
        if(root==null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right?left+1:right+1;//返回当前结点的最大长度(往下)
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
