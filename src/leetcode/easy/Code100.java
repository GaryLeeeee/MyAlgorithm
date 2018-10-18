package leetcode.easy;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2018-09-29 01:17.
 * 100.相同的树(https://leetcode-cn.com/problems/same-tree/)
 */
public class Code100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null){
            //不可用==和true替换，因为逻辑是有一处不同则返回false
            if(p.val!=q.val)
                return false;
            else
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else
            return p==null&&q==null;//如果都为null则相同，否则不同
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        System.out.println(isSameTree(p,q));
    }
}
