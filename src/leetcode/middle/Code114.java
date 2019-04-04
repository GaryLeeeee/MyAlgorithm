package leetcode.middle;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2019-04-04 20:05.
 */
public class Code114 {
    public void flatten(TreeNode root) {
        //如果为空，就直接跳出
        if(root ==null)
            return;

        //将root左右子树转换为链表
        if(root.left!=null)
            flatten(root.left);
        if(root.right!=null)
            flatten(root.right);

        //转换为链表过程
        //如： 1           1
        //   2   3   =>      2
        //                     3
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;

        //因为左边的可能是一串很长的链表，所以要把接过去的链表(左子树)遍历到最后一个结点
        //然后再将原来右子树接上去
        while(root.right != null){
            root = root.right;
        }

        root.right = tmp;
    }

    public static void main(String[] args) {

    }
}
