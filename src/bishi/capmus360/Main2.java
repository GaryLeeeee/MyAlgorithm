package bishi.capmus360;


import java.util.Scanner;

/**
 * Created by GaryLee on 2019-08-31 15:59.
 * 题目简要：
 *  小A在一条笔直的路上走，该路平均分为m个点，小A可能从任意一个点出发
 *  n表示小A每个阶段记录的路程(每一段都是单向)，不同段可能是同向可能是反向的
 *  问这样的终点有几个？
 * 输入：
 * 10 3
 * 5
 * 2
 * 6
 * 输出：
 * 8
 */
public class Main2 {
    /**
     * 思路：每一段可能往左走可能往右走，我们可能记录所有情况的状态
     * 比如从1出发5就可能是-4,6
     * 再出发5就可能是-9,1,1,11
     *
     * 用二叉树存储最为合适(目前想到的)
     * 左右子树对应向左走向右走，以此类推
     * 最后只需要看有哪条 root->根节点 之间的value全在该条路上(长度)
     *
     * root默认是起点，如果算终点的话，就可以反过来走
     * 比如5 2 6->6 2 5
     */
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//等分点数(可做起点/终点数)
        int n = sc.nextInt();//有几段小路程

        int count = 0;//记录结果

        int[] arr = new int[n];
        //二叉树，左子树往左走，右子树同理
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            arr[i] = value;

        }
        /**
         * 以下有大问题
         * 可能会超时，所以加了这一步可以拦截比较多的用例
         * ac36->ac72
         */
        for(int i=0;i<n;i++){
            if(arr[i]>m-1){
                System.out.println(0);
                return;
            }
        }
        //m为每一个点
        for(int i=0;i<m;i++){
            //从哪出发
            TreeNode treeNode = new TreeNode(i+1);
            for(int j=n-1;j>=0;j--){
//                System.out.print(arr[j]+" ");
                addSubtree(treeNode,arr[j],m);
            }
//            System.out.println();
            //是否这里是否存在
            boolean ifTrue = hasRootToLeaf(treeNode,m);
            if(ifTrue)
                count++;
            System.out.println(ifTrue);
        }

        System.out.println(count);


        //到这里整棵树都构建完毕了
        //只需要看有没有一条root->叶子节点的val都在1->m间

    }
    //value=要走多少步

    /**
     * 每一段路程都创建左右子树(因为可能往左走和往右走)
     */
    public static void addSubtree(TreeNode root,int value,int length){
        if(root.val<1|| root.val>length)
            return ;
        if(root.left!=null&&root.right!=null){
            addSubtree(root.left,value,length);
            addSubtree(root.right,value,length);
        }else {

        root.left = new TreeNode(root.val-value);
        root.right = new TreeNode(root.val+value);}
    }

    /**
     * 判断是否存在root->叶子结点的所有结点value都处于length内
     * @return
     */
    public static boolean hasRootToLeaf(TreeNode root,int length){
        if(root.val<1|| root.val>length)
            return false;
        //在这里已经是在路中间，看看是不是最后一次了
        if(root.left==null&&root.right==null)
            return true;
        //左右有一条符合就可以
        return hasRootToLeaf(root.left,length)||hasRootToLeaf(root.right,length);
    }


}
