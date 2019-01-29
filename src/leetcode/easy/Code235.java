package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-12-15 17:14.
 * 235.二叉探索树的最近共同祖先(https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/）
 * 二叉搜索树:结点左边的val小于该结点，右边的大于该结点
 */
public class Code235 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        while(root!=null){
//            先做root是否介于前者之间判断，但是没规定p、q哪个大
//            if((root.val>=p.val&&root.val<=q.val)||(root.val<=p.val&&root.val>=q.val))
//                return root;
//            那就先做判断大小，毕竟是判断比两个都大，或两个都小
            if(root.val>p.val&&root.val>q.val)
                root = root.left;
            else if(root.val<p.val&&root.val<q.val)
                root = root.right;
            else
                return root;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(0);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.right.left = new TreeNode(3);
        treeNode.left.right.right = new TreeNode(5);
        treeNode.right = new TreeNode(8);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);
        System.out.println(lowestCommonAncestor(treeNode,treeNode.left,treeNode.right).val);


        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        System.out.println(lowestCommonAncestor(treeNode2,treeNode2,treeNode2.left).val);
    }
}

