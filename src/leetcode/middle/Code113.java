package leetcode.middle;

import leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaryLee on 2019-04-04 20:40.
 * 113. 路径总和 II(https://leetcode-cn.com/problems/path-sum-ii/)
 */
public class Code113 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {

        //存放最终结果
        List<List<Integer>> list = new ArrayList<>();
        //存放每一个可能情况的integer集合
        List<Integer> integers = new ArrayList<>();
        //从头结点开始递归
        dfs(list,root,sum,integers);

        return list;
    }

    public static void dfs(List<List<Integer>> list,TreeNode treeNode,int sum,List<Integer> integers){
        if(treeNode==null)
            return;

        integers.add(treeNode.val);
        //如果当前为叶子节点，并且和符合sum
        if(treeNode.val==sum&&treeNode.left==null&&treeNode.right==null)
            list.add(integers);
        else {
            //新建一个list
            //integers给左子树用，right给右子树用
            List<Integer> right = new ArrayList<>(integers);

            //继续往下遍历
            dfs(list,treeNode.left,sum-treeNode.val,integers);
            dfs(list,treeNode.right,sum-treeNode.val,right);

        }


    }

    public static void main(String[] args) {

    }
}
