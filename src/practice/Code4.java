package practice;

import leetcode.structure.TreeNode;

/**
 * Created by GaryLee on 2019-08-10 19:31.
 * 剑指offer-重构二叉树
 * 大概思路懂，但就是代码还是不熟练，下标容易搞混
 */
public class Code4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
        if(startPre>endPre||startIn>endIn)
            return null;
        //前序的第一个就是父节点
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++){
            //在中序查找该父节点，一直循环
            if(in[i]==root.val){
                //前序的需要跳过父节点，然后中序的找左边就行
                //startPre是先序的头，通过i-startIn获取到左边的长度，然后计算endPre
                //最后一个的i是父节点，所以需要i-1
                root.left = reConstructBinaryTree(pre,startPre+1,startPre+i-endIn,in,startIn,i-1);
                //先序是在left后续上的，中序则是在右边
                root.right = reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        new Code4().reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6});
    }
}
