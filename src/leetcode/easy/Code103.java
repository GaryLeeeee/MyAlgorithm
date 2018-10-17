package leetcode.easy;

import leetcode.structure.TreeNode;

import java.util.*;

/**
 * Created by GaryLee on 2018-10-17 18:18.
 */
public class Code103 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> integers = new ArrayList<>();
            int size = queue.size();
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
