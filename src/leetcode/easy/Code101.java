package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-10-14 01:09.
 * 101.对称二叉树(https://leetcode-cn.com/problems/symmetric-tree/)
 */
public class Code101 {
    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else
            return isSymmetricDouble(root.left,root.right);
    }
    public static boolean isSymmetricDouble(TreeNode left,TreeNode right){
        if(left==null&&right==null)//如果左右子树均为null,则对称
            return true;
        else if(left==null||right==null)//如果左右子树任一为null,则不对称
            return false;
        else if(left.val!=right.val)//如果左右子树值不相同,则不对称
            return false;
        else
            return isSymmetricDouble(left.left,right.right)&&isSymmetricDouble(left.right,right.left);//递归,左子树的左子树与右子树的右子树比,左右与右左比,以此类推
    }
    //1,2,2,3,4,4,3
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(3);
        System.out.println(isSymmetric(treeNode));
    }
}
