package leetcode.easy;

/**
 * Created by GaryLee on 2019-07-23 11:24.
 * 70.爬楼梯(https://leetcode-cn.com/problems/climbing-stairs/)
 */
public class Code70 {
    //暴力法
    //时间超过限制(不通过)
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        return climbStairs(n-1)+climbStairs(n-2);
    }
    //动态规划(获取前面计算好的结果)
    //S(n)=S(n-1)+S(n-2)
    public static int climbStairs2(int n) {
        if(n==1)
            return 1;
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;
        for(int i=2;i<n;i++){
            num[i] = num[i-1] + num[i-2];
        }
        return num[n-1];

    }

    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs2(n));
    }
}
