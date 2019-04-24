package leetcode.easy;

import java.util.Arrays;

/**
 * Created by GaryLee on 2019-04-23 19:15.
 * 455.分发饼干(https://leetcode-cn.com/problems/assign-cookies/)
 */
public class Code455 {
    //1 2
    //1 2 3
    public static int findContentChildren(int[] g, int[] s) {
        //把两个数组先排序好，避免需要遍历比较
        Arrays.sort(g);
        Arrays.sort(s);
        int m = 0;//存放已满足孩子个数（下标）
        int n = 0;//饼干下标
        while(m<g.length&&n<s.length){
            //如果当前的饼干能满足当前的孩子
            if(g[m]<=s[n])
                m++;
            //无论如何n就要++
            //如果满足就吃掉了，如果不满足那也不满足后面的孩子
            n++;
        }
        return m;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1,2};
        int[] s = new int[]{1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
