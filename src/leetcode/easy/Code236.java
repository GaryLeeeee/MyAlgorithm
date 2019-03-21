package leetcode.easy;

import leetcode.structure.TreeNode;
import leetcode.structure.TreeUtils;

import java.util.List;

/**
 * Created by GaryLee on 2019-03-21 21:12.
 * 236. 二叉树的最近公共祖先(https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)1
 */
public class Code236 {
    /**
     * 思路：从根节点开始判断，如果左子树和右子树存在p和q，则该点是共同父节点
     * 注意点：要考虑是最近的！！
     */
    public static  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;

        if(root==p||root==q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        //如果左右都找到了
        if(left!=null&&right!=null)
            return root;
        //如果只有单边有，那当前root不是最近祖先(但是是共同祖先)
        if(left!=null)
            return left;
        if(right!=null)
            return right;

        return null;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(5);
        head.right = new TreeNode(1);

        head.left.left = new TreeNode(6);
        head.left.right = new TreeNode(2);

        head.left.right.left = new TreeNode(7);
        head.left.right.right = new TreeNode(4);

        head.right.left = new TreeNode(0);
        head.right.right = new TreeNode(8);

        System.out.println(lowestCommonAncestor(head,head.left.left,head.left.right.right).val);
    }
}
