package leetcode.easy;

import leetcode.structure.TreeNode;

import java.util.*;

/**
 * Created by GaryLee on 2018-10-17 18:18.
 * 107.二叉树的层次遍历II(https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)
 */
public class Code107 {
    //广度优先搜索
    //思路:由上而下每一行,将结点存放在Queue
    //然后会从Queue一个个取出来,将值存放到List<Integer>中(循环当前Queue个数的次数)
    //同时将每个结点的子节点add进Queue中,循环②结束后存放到List<List<Integer>>中,重复操作
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();//存放每一行结点(包括null)
        queue.add(root);//①
        while (!queue.isEmpty()){
            List<Integer> integers = new ArrayList<>();//存放每一行每个结点的值(除了null)
            int size = queue.size();//为当前行的结点个数(包括null)
            for(int i=0;i<size;i++){
                TreeNode treeNode =  queue.poll();
                if(treeNode!=null) {
                    integers.add(treeNode.val);
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
            }
            if(!integers.isEmpty())
                lists.add(0,integers);
        }
        return lists;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.left.left = null;
        treeNode.left.right = null;
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        System.out.println(treeNode);
        List<List<Integer>> lists = levelOrderBottom(treeNode);
        System.out.println(lists);
//        for(List<Integer> list:lists)
//            System.out.println(list);
    }
}
