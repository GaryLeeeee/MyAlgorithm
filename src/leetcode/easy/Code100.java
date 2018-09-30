package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-09-29 01:17.
 * 100.相同的树(https://leetcode-cn.com/problems/same-tree/)
 */
public class Code100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null){
            if(p.val!=q.val)
                return false;
            else
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else {
            return p==null&&q==null;
        }

    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);

        System.out.println(isSameTree(treeNode1,treeNode2));
    }
}
